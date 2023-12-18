import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.TreeMap;
public class Main {
	static Map<Long,Data> map;
	static long PP = 1000005;
	static int INF = 2 << 28;
 
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] p = new int[M];
		int[] q = new int[M];
		int[] c = new int[M];
		for(int i = 0; i < M; i++) {
			p[i] = sc.nextInt();
			q[i] = sc.nextInt();
			c[i] = sc.nextInt();
		}
		map = new HashMap<Long,Data>(M);
		for(int i = 1; i <= N; i++) {
			map.put(i * PP + -1, new Data(i,-1));
		}
		for(int i = 0; i < M; i++) {
			int P = p[i];
			int Q = q[i];
			int C = c[i];
			long PPP = P * PP;
			long QQQ = Q * PP;
			if(!map.containsKey(PPP + C)) {
				Data tmp = new Data(P,C);
				tmp.next.add(new Edge(PPP - 1, 0));
				map.put(PPP + C, tmp);
				Data ga  = map.get(PPP - 1);
				ga.next.add(new Edge(PPP + C,1));
			}
			if(!map.containsKey(QQQ + C)) {
				Data tmp = new Data(Q,C);
				tmp.next.add(new Edge(QQQ - 1, 0));
				map.put(QQQ + C, tmp);
				Data ga  = map.get(QQQ - 1);
				ga.next.add(new Edge(QQQ + C,1));
			}
		}
		int I = 0;
		for(I = 0; I < M; I++) {
			int P = p[I];
			int Q = q[I];
			int C = c[I];
			long PPP = P * PP;
			long QQQ = Q * PP;

			Data PD = map.get(PPP + C);
			PD.next.add(new Edge(QQQ + C, 0));
			Data QD = map.get(QQQ + C);
			QD.next.add(new Edge(PPP + C,0));

		}
		Data start = map.get(PP -1);
		start.cost = 0;
		PriorityQueue<Data> Q = new PriorityQueue<Data>();
		Q.add(start);
		while(!Q.isEmpty()) {
			Data pp = Q.poll();
			if(pp.id == N) {
				map.get(N * PP - 1).cost = pp.cost;
				break;
			}
			int pns = pp.next.size();
			for(int i = 0; i < pns; i++) {
				Edge next = pp.next.get(i);
				Data nextD = map.get(next.to);
				if(nextD.cost <= pp.cost + next.cost) continue;
				nextD.cost = pp.cost + next.cost;
				Q.add(nextD);
			}
		}
		Data goal = map.get(N * PP - 1);
		if(goal.cost == INF) {
			System.out.println(-1);
		}
		else {
			System.out.println(goal.cost);
		}
		
		
	}
 
	static class Data implements Comparable<Data>{
		int id;
		int c;
		long cost = INF;
		Data(int a, int b) {
			this.id = a;
			c = b;
		}
		ArrayList<Edge> next = new ArrayList<>();
		@Override
		public int compareTo(Data o) {
			return (int)(this.cost - o.cost);
		}
		
	}
	static class Edge {
		long to;
		long cost;
		Edge(long a, long b) {
			to = a;
			cost = b;
		}
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
    private void skipUnprintable() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;}
    public boolean hasNext() { skipUnprintable(); return hasNextByte();}
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
        if (!hasNext()) throw new NoSuchElementException();
        int n = 0;
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
}