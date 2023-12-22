import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
         
        int v = sc.nextInt();
        int e = sc.nextInt();
        DGraph g = new DGraph(v);
        
        for(int i=0;i<e;i++){
        	g.addEdge(sc.nextInt(), sc.nextInt());
        }
        
        int q = sc.nextInt();
        UnionFindTree uft = g.SCC();
        
        for(int i=0;i<q;i++){
        	if(uft.isEquivalent(sc.nextInt(), sc.nextInt())){
                System.out.println(1);
        	}
        	else{
                System.out.println(0);
        	}
        }

    }

}

class DGraph {

	NodeList[] nlist; //隣接リスト
	
	public DGraph(int vnum){
		this.nlist = new NodeList[vnum];
		for(int i=0;i<vnum;i++){
			nlist[i] = new NodeList();
		}
	}
	
	//辺の追加（同じ辺を複数回追加すると多重辺になる）
	void addEdge(int n, int m){
		nlist[n].add(m);
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
		return sum;
	}
	
	//到達判定
	boolean isNext(int n, int m){
		return nlist[n].contains(m);
	}
	
	//1歩で到達可能な全ての頂点を返す
	NodeList nextList(int n){
		return nlist[n];
	}

	//トポロジカルソート（ans.size()!=vnum()ならDAGでなく、出力に意味はない））
	ArrayList<Integer> topologicalSort(){
		int idig[] = new int[vnum()]; //入次数
		for(int i=0;i<vnum();i++){
			for(int j:nextList(i)){
				idig[j] ++;
			}
		}
		ArrayDeque<Integer> q = new ArrayDeque<>();
		
		for(int i=0;i<vnum();i++){
			if(idig[i]==0){
				q.add(i); //入次数が0ならキューに入れる（DAGなら必ず存在）
			}
		}
		
		ArrayList<Integer> ans = new ArrayList<>();
		
		while(!q.isEmpty()){
			int now = q.pollFirst();
			ans.add(now);
			
			for(int j:nextList(now)){
				idig[j] --;
				if(idig[j]==0){
					q.add(j);
				}
			}
		}
		
		return ans;
	}
	
	//DFSの帰りがけ順のリスト
	ArrayList<Integer> backTrack(){
		ArrayList<Integer> bt = new ArrayList<>();
		int[] parent = new int[vnum()];
		Arrays.fill(parent, -1);
		
		for(int i=0;i<vnum();i++){
			if(parent[i]==-1){
				ArrayDeque<Integer> dq = new ArrayDeque<Integer>();
				dq.add(i);
				parent[i] = -2;
				
				while(!dq.isEmpty()){
					int now = dq.pollFirst();
					boolean isEnd = true;
					
					for(int j:nextList(now)){
						if(parent[j]==-1){
							parent[j] = now;
							dq.offerFirst(j);
							isEnd = false;
						}
					}
					
					if(isEnd){
						bt.add(now);
						boolean con = true;
						while(con){
							now = parent[now];
							
							if(now == -2){
								bt.add(now);
								con = false;
							}
							else{
								boolean isEnd2 = true;
								for(int j:nextList(now)){
									if(parent[j]==-1){
										isEnd2 = false;
									}
								}
								
								if(!isEnd2){
									con = false;
								}
								else{
									bt.add(now);
								}
							}
							
						}
					}
				}
				
			}
		}
		
		return bt;
	}
	
	//強連結成分分解
	UnionFindTree SCC(){
		UnionFindTree uft = new UnionFindTree(vnum());
		
		ArrayList<Integer> bt = backTrack();
		NodeList[] rlist = reverseList();
		boolean isChecked[] = new boolean[vnum()];
		
		for(int i=vnum()-1;i>=0;i--){
			int root = bt.get(i);
			
			if(!isChecked[root]){
				ArrayDeque<Integer> dq = new ArrayDeque<>();
				dq.offerFirst(root);
				isChecked[root] = true;
				
				while(!dq.isEmpty()){
					int now = dq.pollFirst();
					for(int j:rlist[now]){
						if(!isChecked[j]){
							uft.unite(root,j);
							dq.offerFirst(j);
							isChecked[j] = true;
						}
					}
				}
			}
		}
		
		return uft;
	}
	
	//逆辺による隣接リストを返す
	NodeList[] reverseList(){
		NodeList[] rlist = new NodeList[vnum()];
		for(int i=0;i<vnum();i++){
			rlist[i] = new NodeList();
		}
		
		for(int i=0;i<vnum();i++){
			for(int j:nlist[i]){
				rlist[j].add(i);
			}
		}
		
		return rlist;
	}
	
	//サイクルを持つか（DAGか）
	boolean hasCycle(){
		//サイクル上の頂点は、topologicalSortのコードのidigが0になるために自身から伸びる辺を辿ることが必要なので最後までqに入らない
		return !(topologicalSort().size() == vnum());
	}
	
	class NodeList extends ArrayList<Integer>{
		private static final long serialVersionUID = -4461479015945373120L;
	}
}

class UnionFindTree {
	int[] par;
	int[] rank;
	int[] peers; //仲間の数
	
	public UnionFindTree(int n){
		par = new int[n];
		rank = new int[n];
		peers = new int[n];
		
		for(int i=0;i<n;i++){
			par[i] = i;
			peers[i] = 1;
		}
	}
	
	//木の根を求める
	int find(int x){
		if(par[x] == x){
			return x;
		}
		else{
			return par[x] = find(par[x]);
		}
	}
	
	//xとyの属する集合を併合
	public void unite(int x, int y){
		int px = find(x);
		int py = find(y);
		
		if(px == py){
			return;
		}
		else if(rank[px] < rank[py]){
			peers[py] += peers[px];
			par[px] = py;

		}
		else{
			peers[px] += peers[py];
			par[py] = px;
			if(rank[px]==rank[py]){
				rank[px]++;
			}
		}
		
	}
	
	//xとyが同じ集合に属するか
	public boolean isEquivalent(int x, int y){
		return find(x) == find(y);
	}
	
	//xの仲間の数を求める
	public int peersnum(int x){
		return peers[find(x)];
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
	public double nextDouble() {
		return Double.parseDouble(next());
	}
}
