import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class Main {
	
    public static void main(String[] args) {
    	FastScanner sc = new FastScanner();

    	int n = sc.nextInt();
    	int m = sc.nextInt();
    	int s = sc.nextInt()-1;
    	int t = sc.nextInt()-1;
    	
    	WGraph ag = new WGraph(n);

    	for(int i=0;i<m;i++){
        	int u = sc.nextInt()-1;
        	int v = sc.nextInt()-1;
        	int a = sc.nextInt();
        	int b = sc.nextInt();
        	
        	ag.addEdge(u,v,a,b);
    	}
    	
    	long[] al = ag.DijkstraArray(s);
    	long[] bl = ag.DijkstraArray2(t);
    	
    	long gold = 1000000000000000L;
    	
    	long[] ilist = new long[n];
    	for(int i=0;i<n;i++){
    		ilist[i] = gold - al[i] - bl[i];
    	}
    	
    	long[] ans = new long[n];
    	ans[n-1] = ilist[n-1];
    	
    	for(int i=n-2;i>=0;i--){
    		ans[i] = Math.max(ans[i+1],ilist[i]);
    	}
    	
    	for(int i=0;i<n;i++){
    		System.out.println(ans[i]);
    	}
    }
    
}

class WGraph {
	WEdgeList[] elist;
	static long[] g;
	
	public WGraph(int vnum){
		this.elist = new WEdgeList[vnum];
		for(int i=0;i<vnum;i++){
			elist[i] = new WEdgeList();
		}
	}

	//同じ辺を複数回追加すると多重辺が生まれてしまう
	public void addEdge(int a, int b, int w, int w2){
		elist[a].add(new WEdge(b,w,w2));
		elist[b].add(new WEdge(a,w,w2));
	}
	
	//頂点数を返す
	int vnum(){
		return elist.length;
	}
	
	//辺数を返す
	int edgeNum(){
		int sum = 0;
		for(WEdgeList l:elist){
			sum += l.size();
		}
		return sum/2;
	}
	
	//隣接判定
	boolean isNext(int n, int m){
		return elist[n].contains(m);
	}
	
	//隣接する全ての頂点を返す
	ArrayList<Integer> nextList(int n){
		ArrayList<Integer> l = new ArrayList<>();
		for(WEdge e:elist[n]){
			l.add(e.to);
		}
		return l;
	}
	
	//隣接する全ての辺を返す
	WEdgeList EList(int n){
		return elist[n];
	}
	
	//ダイクストラ法でsからgまでの最短距離を求める。到達不可は-1。
	class NodeD implements Comparable<NodeD>{
		int n;
		
		public NodeD(int n){
			this.n = n;
		}
		
		@Override
		public int compareTo(NodeD o){
			return Long.compare(g[n], g[o.n]);
		}

		private WGraph getOuterType() {
			return WGraph.this;
		}
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getOuterType().hashCode();
			result = prime * result + n;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			NodeD other = (NodeD) obj;
			if (!getOuterType().equals(other.getOuterType()))
				return false;
			if (n != other.n)
				return false;
			return true;
		}
	}

	//ダイクストラ法でsからの最短距離列を求める。到達不可は-1。
	long[] DijkstraArray(int start){
		PriorityQueue<NodeD> frontier = new PriorityQueue<>();
		g = new long[vnum()];
		Arrays.fill(g, -1);
		boolean[] isExplored = new boolean[vnum()];
		
		frontier.add(new NodeD(start));
		g[start] = 0;
		
		
		while(!frontier.isEmpty()){
			NodeD now = frontier.poll();
			isExplored[now.n] = true;
			
			for(WEdge e:EList(now.n)){
				if(isExplored[e.to]){
					continue;
				}
				
				NodeD next = new NodeD(e.to);
				if(g[next.n] != -1){
					if(g[next.n] <= g[now.n] + e.w){
						continue;
					}
					else{
						frontier.remove(next);
					}
				}
				g[next.n] = g[now.n] + e.w;
				frontier.add(next);
			}	
		}
		
		return g;
	}
	
	long[] DijkstraArray2(int start){
		PriorityQueue<NodeD> frontier = new PriorityQueue<>();
		g = new long[vnum()];
		Arrays.fill(g, -1);
		boolean[] isExplored = new boolean[vnum()];
		
		frontier.add(new NodeD(start));
		g[start] = 0;
		
		
		while(!frontier.isEmpty()){
			NodeD now = frontier.poll();
			isExplored[now.n] = true;
			
			for(WEdge e:EList(now.n)){
				if(isExplored[e.to]){
					continue;
				}
				
				NodeD next = new NodeD(e.to);
				if(g[next.n] != -1){
					if(g[next.n] <= g[now.n] + e.w2){
						continue;
					}
					else{
						frontier.remove(next);
					}
				}
				
				g[next.n] = g[now.n] + e.w2;
				frontier.add(next);
			}	
		}
		
		return g;
	}


}

class WEdgeList extends ArrayList<WEdge>{
	private static final long serialVersionUID = 4901656039324433445L;
}

class WEdge{
	int to;
	int w;
	int w2;
	
	public WEdge(int to, int w,int w2){
		this.to = to;
		this.w = w;
		this.w2 = w2;
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