import java.io.IOException;
import java.io.InputStream;
import java.util.*;
 
public class Main{
	public static void main(String[] args){
		FastScanner sc = new FastScanner();
		int N = sc.nextInt();
		int M = sc.nextInt();
		List<Edge> list = new ArrayList<Edge>();
		for(int i=0; i<M; i++){
			list.add(new Edge(sc.nextInt()-1, sc.nextInt()-1, -1*sc.nextLong()));
		}
		Edge[] edges = list.toArray(new Edge[0]);
		
		long ans = bellmanford(N, edges, 0, N-1);
		if(ans == Long.MIN_VALUE){
			System.out.println("inf");
		}else{
			System.out.println(-1*ans);
		}
		return;
	}
	
	public static long bellmanford(int n, Edge[] edges, int s, int g) {
        long[] distance = new long[n];        //始点からの最短距離
        int[] count = new int[n];           //更新カウント(負の閉路チェック用)

        Arrays.fill(distance, Long.MAX_VALUE);    //各頂点までの距離を初期化(INF 値)
        distance[s] = 0;    //始点の距離は０

        boolean negative = false;     //負の閉路フラグ
        boolean update = true;        //更新フラグ

        while (update && !negative) {
            update = false;
            for (Edge e : edges) {
                //接続元＋接続先までの距離
                if (distance[e.source] != Long.MAX_VALUE && distance[e.source] + e.cost < distance[e.target]) {
                    distance[e.target] = distance[e.source] + e.cost;    //現在記録されている距離より小さければ更新
                    update = true;

                    if (++count[e.target] >= n) {    //負の閉路チェック
                        negative = true;
                        break;
                    }
                }
            }
        }

        if (negative) {
            return Long.MIN_VALUE;    //負の閉路があったときは、-INF(Integer.MIN_VALUE)を返す
        }
        return distance[g];    //到達できなかったときは、INF(Integer.MAX_VALUE)になる
    }
}


class Edge{
    public int source = 0;    //接続元ノード
    public int target = 0;    //接続先ノード
    public long cost = 0;      //重み

    public Edge(int source, int target, long cost) {
        this.source = source;
        this.target = target;
        this.cost = cost;
    }

    public long compareTo(Edge o) {
        return this.cost - o.cost;
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