import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;
import java.math.BigInteger;
 
public class Main implements Runnable {
	
	static int mod = 1000000007;
	
    public static void main(String[] args) {
    	new Thread(null, new Main(), "", 1024 * 1024 * 1024).start();
    }
    
    public void run() {
        PrintWriter out = new PrintWriter(System.out);
        FastScanner sc = new FastScanner();
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        Combinatrics c = new Combinatrics(k);
        
        SGraph g = new SGraph(n,k,c);
        
        for(int i=0;i<n-1;i++){
        	g.addEdge(sc.nextInt()-1, sc.nextInt()-1);
        }
        
        out.println(g.solve());

        out.flush();
    }

}

class SGraph {

	NodeList[] nlist; //隣接リスト
	static int mod = 1000000007;
	int k;
	Combinatrics c;
	
	public SGraph(int vnum,int k,Combinatrics c){
		this.nlist = new NodeList[vnum];
		for(int i=0;i<vnum;i++){
			nlist[i] = new NodeList();
		}
		this.k = k;
		this.c = c;
	}
	
	//辺の追加（同じ辺を複数回追加すると多重辺になる）
	void addEdge(int n, int m){
		nlist[n].add(m);
		nlist[m].add(n);
	}
	
	//頂点数を返す
	int vnum(){
		return nlist.length;
	}
	
	//辺数を返す
	int edgeNum(){
		int sum = 0;
		for(NodeList l:nlist){
			sum += l.size();
		}
		return sum/2;
	}
	
	//隣接判定
	boolean isNext(int n, int m){
		return nlist[n].contains(m);
	}
	
	//隣接する全ての頂点を返す
	NodeList nextList(int n){
		return nlist[n];
	}
	
	//含まれる木の数を返す
	int treeNum(){
    	boolean[] isVisited = new boolean[vnum()];
    	int[] par = new int[vnum()];
    	int TreeNum = 0;
    	int checkid = 0;

    	while(true){
    		int core = -1;
    		
    		for(int i=checkid;i<vnum();i++){
    			if(!isVisited[i]){
    				core = i;
    				checkid = i+1;
    				break;
    			}
    		}
    		
    		if(core==-1){
    			break;
    		}
    		
			boolean isTree = true;
			ArrayDeque<Integer> s = new ArrayDeque<>();
			s.offerFirst(core);
			isVisited[core] = true;
			
			while(!s.isEmpty()){
				int now = s.pollFirst();
				
				for(int i:this.nextList(now)){
					
					if(isVisited[i]){
						if(par[now] != i){
    						isTree = false;
						}
					}
					else{
    					s.offerFirst(i);
    					isVisited[i] = true;
    					par[i] = now;
					}
				}

			}
			
			if(isTree){
				TreeNum += 1;
			}
    	}
    	
    	return TreeNum;
	}
	
	//森かどうか返す
	boolean isForest(){
    	boolean[] isVisited = new boolean[vnum()];
    	int[] par = new int[vnum()];
    	int checkid = 0;

    	while(true){
    		int core = -1;
    		
    		for(int i=checkid;i<vnum();i++){
    			if(!isVisited[i]){
    				core = i;
    				checkid = i+1;
    				break;
    			}
    		}
    		
    		if(core==-1){
    			break;
    		}
    		
			boolean isTree = true;
			ArrayDeque<Integer> s = new ArrayDeque<>();
			s.offerFirst(core);
			isVisited[core] = true;
			
			while(!s.isEmpty()){
				int now = s.pollFirst();
				
				for(int i:this.nextList(now)){
					
					if(isVisited[i]){
						if(par[now] != i){
    						isTree = false;
						}
					}
					else{
    					s.offerFirst(i);
    					isVisited[i] = true;
    					par[i] = now;
					}
				}

			}
			
			if(!isTree){
				return false;
			}
    	}
    	
    	return true;
	}
	
	//連結成分数を返す（森ならV-Eでいい）
	int CCNum(){
    	boolean[] isVisited = new boolean[vnum()];
    	int CNum = 0;
    	int checkid = 0;
    	
    	while(true){
    		int core = -1;
    		
    		for(int i=checkid;i<vnum();i++){
    			if(!isVisited[i]){
    				core = i;
    				checkid = i+1;
    				break;
    			}
    		}
    		
    		if(core==-1){
    			break;
    		}
			ArrayDeque<Integer> s = new ArrayDeque<>();
			s.offerFirst(core);
			isVisited[core] = true;
			CNum += 1;
			
			while(!s.isEmpty()){
				int now = s.pollFirst();
				
				for(int i:this.nextList(now)){
					if(!isVisited[i]){
    					s.offerFirst(i);
    					isVisited[i] = true;
					}
				}
			}
    	}
    	
    	return CNum;
	}

	long solve(){
		boolean[] checked = new boolean[vnum()];
		
		long ans = k;	//根
		checked[0] = true;
		
		ArrayDeque<Integer> q = new ArrayDeque<>();
		
		ans *= c.permutation(k-1, nextList(0).size());
		ans %= mod;
		
		for(int i:nextList(0)){
			checked[i] = true;
		}
		
		for(int i:nextList(0)){
			q.offerFirst(i);
		}
		
		while(!q.isEmpty()){
			int now = q.pollFirst();
			
			int childsize = 0;
			
			for(int i:nextList(now)){
				if(!checked[i]){
					q.offerLast(i);
					checked[i] = true;
					childsize++;
				}
			}
			
			if(childsize != 0){
				ans *= c.permutation(k-2, childsize);
				ans%= mod;
			}
		}
		
		return ans;
	}
	
	//2点間距離をBFSで求める。到達不可は-1。
	int distance(int n, int m){
		
		ArrayDeque<Integer> q = new ArrayDeque<>();
		int[] d = new int[vnum()];	//nとの距離。未チェックなら-1。
		for(int i=0;i<vnum();i++){
			d[i] = -1;
		}
		
		q.add(n);
		d[n] = 0;
		
		while(!q.isEmpty()){
			int now = q.pollFirst();
			
			for(int i:nextList(now)){
				if(d[i] == -1){
					if(i==m){
						return d[now]+1;
					}
					
					d[i] = d[now]+1;
					q.offerLast(i);
				}
			}
		}
		
		return -1;
	}
	
	//n→mへの最短経路
	ArrayList<Integer> shortestWay(int n, int m){
		ArrayDeque<Integer> q = new ArrayDeque<>();
		int[] d = new int[vnum()];	//nとの距離。未チェックなら-1。
		int[] par = new int[vnum()];	//親
		for(int i=0;i<vnum();i++){
			d[i] = -1;
		}
		
		//便宜上m→nで探す（リストを逆順にする手間が省ける）
		q.add(m);
		d[m] = 0;
		par[m] = -1;
		
		while(!q.isEmpty()){
			int now = q.pollFirst();
			
			for(int i:nextList(now)){
				if(d[i] == -1){
					if(i==n){
						par[i] = now;
						ArrayList<Integer> way = new ArrayList<>();
						for(int k=i;k!=-1;k=par[k]){
							way.add(k);
						}
						return way;
					}
					
					d[i] = d[now]+1;
					par[i] = now;
					q.offerLast(i);
				}
			}
		}
		
		//経路なし
		return new ArrayList<Integer>();
	}
	
	//nとの距離のリストを返す（BFS）。到達不可は-1。
	int[] distanceArray(int n){
		
		ArrayDeque<Integer> q = new ArrayDeque<>();
		int[] d = new int[vnum()];	//nとの距離。未チェックなら-1。
		for(int i=0;i<vnum();i++){
			d[i] = -1;
		}
		
		q.add(n);
		d[n] = 0;
		
		while(!q.isEmpty()){
			int now = q.pollFirst();
			
			for(int i:nextList(now)){
				if(d[i] == -1){
					d[i] = d[now]+1;
					q.offerLast(i);
				}
			}
		}
		
		return d;
	}
	
	//2部グラフかどうか判定
	boolean isBipartite(){
		//白黒で2彩色可能か判定
		boolean[] isBlack = new boolean[vnum()];
		boolean[] isChecked = new boolean[vnum()];
		ArrayDeque<Integer> q = new ArrayDeque<>();
		
		boolean con = true;
		
		while(con){
			
			int core = -1;
			for(int i=0;i<vnum();i++){
				if(!isChecked[i]){
					core = i;
				}
			}
			
			if(core!=-1){
				q.offerFirst(core);
				isBlack[core] = true;
				isChecked[core] = true;
				
				while(!q.isEmpty()){
					int now = q.pollFirst();
					
					for(int i:nextList(now)){
						if(!isChecked[i]){
							isChecked[i] = true;
							isBlack[i] = !isBlack[now];
							q.offerFirst(i);
						}
						else{
							if(isBlack[i] == isBlack[now]){
								return false;
							}
						}
					}
				}	
			}
			else{
				con = false;
			}	
			
		}
	
		return true;
	}
	
	//2部グラフにしたときの、左右の頂点数のうち小さい方を返す（連結前提、不可能なら-1を返す）
	int bipartiteNum(){
		//白黒で2彩色可能か判定
		boolean[] isBlack = new boolean[vnum()];
		boolean[] isChecked = new boolean[vnum()];
		ArrayDeque<Integer> q = new ArrayDeque<>();
		
		q.offerFirst(0);
		isBlack[0] = true;
		isChecked[0] = true;
		
		while(!q.isEmpty()){
			int now = q.pollFirst();
			
			for(int i:nextList(now)){
				if(!isChecked[i]){
					isChecked[i] = true;
					isBlack[i] = !isBlack[now];
					q.offerFirst(i);
				}
				else{
					if(isBlack[i] == isBlack[now]){
						return -1;
					}
				}
			}
		}	
	
		//ここに到達すれば二部グラフ
		int blacknum = 0;
		for(int i=0;i<vnum();i++){
			if(isBlack[i]){
				blacknum += 1;
			}
		}
		
		return Math.min(blacknum, vnum()-blacknum);
	}

	//橋を列挙（連結グラフ）（indexは小→大）
	public ArrayList<EdgePair> bridge(){
		int[] ord = new int[vnum()];
		int[] ordidx = new int[vnum()]; //そのオーダーを持つ頂点のインデックス
		int[] lowlink = new int[vnum()];
		Arrays.fill(lowlink, -1);
		
		//DFS木を作り、ordを求める
		ArrayDeque<Integer> a = new ArrayDeque<>();
		a.offerFirst(0);
		int noword = 0;
		boolean isVisited[] = new boolean[vnum()];
		int parent[] = new int[vnum()];
		HashSet<EdgePair> tree = new HashSet<>(); //DFS木に含まれる辺（ここになければ後退辺
		
		while(!a.isEmpty()){
			int now = a.pollFirst();
			
			if(isVisited[now]){
				continue;
			}
			isVisited[now] = true;
			tree.add(new EdgePair(parent[now],now));
			
			ord[now] = noword;
			ordidx[noword] = now;
			noword++;
			
			for(int i:nextList(now)){
				a.offerFirst(i);
				parent[i] = now;
			}
		}
		
		//後ろからlowlinkを求める
		for(int i=vnum()-1;i>=0;i--){
			int now = ordidx[i];
			int min = i;
			for(int j:nextList(now)){
				if(ord[j]<i){	//jが親
					if(tree.contains(new EdgePair(j,now))){ //後退辺でないなら数えない
						continue;
					}
				}
				if(lowlink[j]!=-1){
					if(min>lowlink[j]){
						min = lowlink[j];
					}
				}
				else{
					if(min>ord[j]){
						min = ord[j];
					}
				}
			}
			lowlink[now] = min;
		}
		
		ArrayList<EdgePair> ans = new ArrayList<>();
		
		//全ての辺が橋かチェック
		for(int i=0;i<vnum();i++){
			for(int j:nextList(i)){
				if(ord[i]<ord[j]){ //iが親のときのみ調べる（2重に調べるのを防ぐ）
					if(ord[i] < lowlink[j]){
						ans.add(new EdgePair(Math.min(i,j),Math.max(i,j)));
					}
				}
			}
		}
		
		return ans;
	}
	
	//関節点を列挙（昇順）
	public ArrayList<Integer> articulationPoints(){
		int[] ord = new int[vnum()];
		int[] ordidx = new int[vnum()]; //そのオーダーを持つ頂点のインデックス
		int[] lowlink = new int[vnum()];
		Arrays.fill(lowlink, -1);
		
		//DFS木を作り、ordを求める
		ArrayDeque<Integer> a = new ArrayDeque<>();
		a.offerFirst(0);
		int noword = 0;
		boolean isVisited[] = new boolean[vnum()];
		int parent[] = new int[vnum()];
		HashSet<EdgePair> tree = new HashSet<>(); //DFS木に含まれる辺（ここになければ後退辺
		
		while(!a.isEmpty()){
			int now = a.pollFirst();
			
			if(isVisited[now]){
				continue;
			}
			isVisited[now] = true;
			tree.add(new EdgePair(parent[now],now));
			
			ord[now] = noword;
			ordidx[noword] = now;
			noword++;
			
			for(int i:nextList(now)){
				a.offerFirst(i);
				if(!isVisited[i]){
					parent[i] = now;
				}
			}
		}
		
		//後ろからlowlinkを求める
		for(int i=vnum()-1;i>=0;i--){
			int now = ordidx[i];
			int min = i;
			for(int j:nextList(now)){
				if(ord[j]<i){	//jが親
					if(tree.contains(new EdgePair(j,now))){ //後退辺でないなら数えない
						continue;
					}
				}
				if(lowlink[j]!=-1){
					if(min>lowlink[j]){
						min = lowlink[j];
					}
				}
				else{
					if(min>ord[j]){
						min = ord[j];
					}
				}
			}
			lowlink[now] = min;
		}
		
		ArrayList<Integer> ans = new ArrayList<>();
		
		//DFS木の根
		int rootnum = 0;
		rl:for(int i:nextList(0)){
			if(tree.contains(new EdgePair(0,i))){
				rootnum++;
				if(rootnum>=2){
					ans.add(0);
					break rl;
				}
			}
		}
		
		//DFS木の根以外の頂点
		loop:for(int i=1;i<vnum();i++){
			for(int j:nextList(i)){
				if(parent[j]==i){ //jがiの子
					if(ord[i]<=lowlink[j]){
						ans.add(i);
						continue loop;
					}
				}
			}
		}
		
		return ans;
	}
	
	class EdgePair implements Comparable<EdgePair>{
		int a,b;
		
		public EdgePair(int a, int b){
			this.a = a;
			this.b = b;
		}
		
		@Override
		public boolean equals(Object o){
			if(o instanceof EdgePair){
				EdgePair p = (EdgePair) o;
				return (a == p.a && b == p.b)||(a == p.b && b == p.a);
			}
			return super.equals(o);
		}
		
		@Override
		public int compareTo(EdgePair o){
			if(a!=o.a){
				return Integer.compare(a,o.a);
			}
			return Integer.compare(b, o.b);
		}
		
		@Override
		public int hashCode(){
			return (a<<16)+b;
		}
		
	}
	class NodeList extends ArrayList<Integer>{
		private static final long serialVersionUID = -4461479015945373120L;
	}
}

class Combinatrics {
	
	static long mod = 1000000007; //逆元を取るので素数前提
	static long[] fact; //階乗のテーブル
	static long[] inv;	//逆元のテーブル
	static long[] finv; //階乗の逆元のテーブル
	
	public Combinatrics(int n){
		int N = Math.max(2,n+1);
		fact = new long[N];
		inv = new long[N];
		finv = new long[N];
	    fact[0] = fact[1] = 1;
	    finv[0] = finv[1] = 1;
	    inv[1] = 1;
	    for(int i=2;i<N; i++){
	        fact[i] = fact[i-1] * i % mod;
	        inv[i] = mod - inv[(int)mod%i] * (mod / i) % mod;
	        finv[i] = finv[i-1] * inv[i] % mod;
	    }
	}
	
	//逆元
	public int inv(int n){
		return (int)inv[n];
	}
	
	//n!
	public int factorial(int n){
		return (int)fact[n];
	}
	
	//n!の逆元
	public int factInv(int n){
		return (int)finv[n];
	}
	
	//nCr（n個からr個選ぶ）
    public int combination(int n, int r) {
        if(n<r|| r<0){
        	return 0;
        }
        return (int)(fact[n]*finv[r]%mod*finv[n-r]%mod);
    }

    //nPr (=n*(n-1)*...*(n-r+1))（n個からr個選んで並べる）
    public int permutation(int n, int r) {
        if(n<r || r<0){
        	return 0;
        }
        return (int)(fact[n]*finv[n-r]%mod);
    }

    //nHr (=n+r-1Cr)（n個から重複を許してk個とる）
    //（テーブルがn+r-1まで必要な事に注意！）
    public int homogeneous(int n, int r) {
        if(n==0 && r==0){
        	return 1;
        }
        return combination(n+r-1,r);
    }
    
    //全射の個数（テーブルはkまで必要）
    //n個の区別可能なボールをちょうどk個の区別可能な箱に入れる組合せの数
    public int surjection(int n, int k){
    	long ans = 0;
    	int sign = 1; //符号
    	if(k%2 == 0){
    		sign = -1;
    	}
    	//包除原理
    	for(int i=1;i<=k;i++){
    		if(sign==1){
    			ans += (long)combination(k,i)*iterationPow(i,n);
    			ans %= mod;
    		}
    		else{
    			ans -= (long)combination(k,i)*iterationPow(i,n);
    			ans %= mod;
    		}
    		sign *= -1;
    	}
    	ans = mod(ans);
    	return (int)ans;
    }
	//x^nをmodのもとで繰り返し2乗法で求める。
	static long iterationPow(long x, long n){
	    long sum = 1;
	    while(n>0){
	        if((n&1)== 1){  //ビットが立っていたら
	            sum *= x;        //x^2^k1 * x^2^k2 * x^2^k3 * ・・・
	            sum %= mod;
	        }
	        x *= x;              //((x^2)^2)^2・・・
	        x %= mod;
	        n >>= 1;
	    }
	    return sum;
	}
	//負の数に対応したmod
	static long mod(long a) {
		return (a % mod + mod) % mod;
	}
    
	//スターリング数（テーブルはkまで必要）
	//n個の区別可能なボールをちょうどk個の区別不可能な箱に入れる組合せの数
	public int stirling(int n, int k){
		//全射の個数をk!で割ったものに等しい
		return (int) ((long)surjection(n,k)*(long)factInv(k) % mod);
	}
	
	//ベル数（テーブルはkまで必要）
	//n個の区別可能なボールをk個以下の区別不可能な箱に入れる組合せの数
	public int bell(int n, int k){
		int ans = 0;
		//S(n,1)からS(n,k)まで足し合わせる
		for(int i=1;i<=k;i++){
			ans += stirling(n,i);
			ans %= mod;
		}
		return ans;
	}
	
}

class FastScanner {
	private final InputStream in = System.in;
	private final byte[] buffer = new byte[1024];
	private int ptr = 0;
	private int buflen = 0;
	private boolean hasNextByte() {
		if (ptr < buflen) {
			return true;
		} else {
			ptr = 0;
			try {
				buflen = in.read(buffer);
			} catch (IOException e) {
				e.printStackTrace();
			}
			if (buflen <= 0) {
				return false;
			}
		}
		return true;
	}
	private int readByte() {
		if (hasNextByte())
			return buffer[ptr++];
		else
			return -1;
	}
	private static boolean isPrintableChar(int c) {
		return 33 <= c && c <= 126;
	}
	public boolean hasNext() {
		while (hasNextByte() && !isPrintableChar(buffer[ptr]))
			ptr++;
		return hasNextByte();
	}
	public String next() {
		if (!hasNext())
			throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while (isPrintableChar(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}
	public long nextLong() {
		if (!hasNext())
			throw new NoSuchElementException();
		long n = 0;
		boolean minus = false;
		int b = readByte();
		if (b == '-') {
			minus = true;
			b = readByte();
		}
		if (b < '0' || '9' < b) {
			throw new NumberFormatException();
		}
		while (true) {
			if ('0' <= b && b <= '9') {
				n *= 10;
				n += b - '0';
			} else if (b == -1 || !isPrintableChar(b)) {
				return minus ? -n : n;
			} else {
				throw new NumberFormatException();
			}
			b = readByte();
		}
	}
	public int nextInt() {
		long nl = nextLong();
		if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
			throw new NumberFormatException();
		return (int) nl;
	}
	public int[] nextintArray(int n){
		int[] a = new int[n];
		for(int i=0;i<n;i++){
			a[i] = nextInt();
		}
		return a;
	}
	public long[] nextlongArray(int n){
		long[] a = new long[n];
		for(int i=0;i<n;i++){
			a[i] = nextLong();
		}
		return a;
	}
	public Integer[] nextIntegerArray(int n){
		Integer[] a = new Integer[n];
		for(int i=0;i<n;i++){
			a[i] = nextInt();
		}
		return a;
	}
	public int[][] nextintMatrix(int h, int w){
		int[][] mat = new int[h][w];
		for(int i=0;i<h;i++){
			for(int j=0;j<w;j++){
				mat[i][j] = nextInt();
			}
		}
		return mat;
	}
	public double nextDouble() {
		return Double.parseDouble(next());
	}
}