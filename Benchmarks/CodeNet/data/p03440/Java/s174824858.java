import java.io.IOException;
import java.io.InputStream;
import java.util.*;
 
public class Main{
	public static void main(String[] args){
		FastScanner sc = new FastScanner();
		int N = sc.nextInt();
		int M = sc.nextInt();
		if(M==0){
			if(N==1) System.out.println(0);
			else System.out.println("Impossible");
			return;
		}else if(M<N/2-1) System.out.println("Impossible");
		
		//グラフの作成
		long[] a = new long[N];
		int[][] edge = new int[M][2];
		for(int i=0;i<N;++i) a[i] = sc.nextLong();
		for(int i=0;i<M;++i){
			edge[i][0] = sc.nextInt();
			edge[i][1] = sc.nextInt();
		}
		
		//森を連結成分に分解し、その個数をカウントする
		int[] parent = new int[N];
		int[] rank = new int[N];
		for(int i=0;i<N;++i){
			parent[i] = i; rank[i] = 0;
		}
		for(int i=0;i<M;++i){
			int xRoot = find(edge[i][0],parent);
			int yRoot = find(edge[i][1],parent);
			if( xRoot!=yRoot ){
				if(rank[xRoot]>rank[yRoot]){
					parent[yRoot]=xRoot;
				}else if(rank[xRoot]<rank[yRoot]){
					parent[xRoot]=yRoot;
				}else{
					parent[yRoot]=xRoot;
					rank[xRoot]++;
				}
			}
		}
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(find(0,parent));
		for(int i=1;i<N;++i){
			if(al.indexOf(find(i,parent))==-1) al.add(parent[i]);
		}
		int num = al.size();
		
		//(連結成分の個数)-1だけ辺を最小コストで追加する
		long ans = 0;
		boolean[] used = new boolean[N];
		int kijun = find(0,parent);
		for(int i=num-1;i>0;i--){
			long kouho1=Long.MAX_VALUE;
			long kouho2=Long.MAX_VALUE;
			int p1 = -1;
			int p2 = -1;
			for(int j=0;j<N;++j){
				if(!used[j]&&find(j,parent)==kijun&&a[j]<kouho1){
					kouho1 = a[j];
					p1 = j;
				}
				if(!used[j]&&find(j,parent)!=kijun&&a[j]<kouho2){
					kouho2 = a[j];
					p2 = j;
				}
			}
			ans += kouho1+kouho2;
			used[p1]=true;
			used[p2]=true;
			int kesu = find(p2,parent);
			for(int j=0;j<N;++j){
				if(find(j,parent)==kesu) parent[j] = kijun;
			}
		}
		System.out.println(ans);
		return;
	}

	public static int find(int x, int[] parent){
		return x==parent[x] ? x : find(parent[x],parent);
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
        }else{
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
    private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
    private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
    public boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}
    public String next() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while(isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }
    public long nextLong() {
        if (!hasNext()) throw new NoSuchElementException();
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
        while(true){
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            }else if(b == -1 || !isPrintableChar(b)){
                return minus ? -n : n;
            }else{
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }
    public int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
        return (int) nl;
    }
    public double nextDouble() { return Double.parseDouble(next());}
}