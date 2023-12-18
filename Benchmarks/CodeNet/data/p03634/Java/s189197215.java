

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		Integer N = Integer.parseInt(sc.next());
		Node v[] = new Node[N];
		int c[] = new int[N-1];
		for(int i=0;i<N;i++){
			v[i] = new Node(i);
		}
		Edge e[] = new Edge[N-1];
		for(int i=0;i<N-1;i++) {
			e[i] = new Edge(v[Integer.parseInt(sc.next())-1],v[Integer.parseInt(sc.next())-1],Integer.parseInt(sc.next()));
		}
		int Q = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());
		int x[] = new int[Q];
		int y[] = new int[Q];
		for(int i=0;i<Q;i++) {
			x[i] = Integer.parseInt(sc.next());
			y[i] = Integer.parseInt(sc.next());
		}
		PriorityQueue<Node> searching = new PriorityQueue<>((u,w)->u.d>w.d?1:u.d<w.d?-1:0);
		PriorityQueue<Node> searched = new PriorityQueue<>((u,w)->u.d>w.d?1:u.d<w.d?-1:0);
		HashSet<Edge> used = new HashSet<>();
		v[K-1].Reload_dist(0);
		for(Edge connect:v[K-1].edges) {
			connect.Other_one(v[K-1]).Reload_dist(connect.cost);
			searching.add(connect.Other_one(v[K-1]));
			used.add(connect);
		}
		searched.add(v[K-1]);

		Node vertex=null;
		while(searching.size()>0) {
			vertex = searching.poll();
			for(Edge connect:vertex.edges) {
				if(!used.contains(connect)) {
					connect.Other_one(vertex).Reload_dist(vertex.d + connect.cost);
					if(!searched.contains(connect.Other_one(vertex))){
						searching.add(connect.Other_one(vertex));
					}
					searched.add(vertex);
					used.add(connect);
				}
			}
		}
		double result = 0;
		for(int i=0;i<Q;i++) {
			result = v[x[i]-1].d + v[y[i]-1].d;
			out.println(result);
		}




		out.flush();
	}
}

class Node{
	int id;
	double d;
	Node prev = null;
	ArrayList<Edge> edges = new ArrayList<>();

	public Node(int id) {
		this.id = id;
		this.d = Integer.MAX_VALUE;
	}

	public void Reset() {
		this.d = Integer.MAX_VALUE;
		this.prev = null;
	}

	public void Reload_dist(double dist) {
		this.d = dist;
	}

	public void Reload_prev(Node v) {
		this.prev = v;
	}

	@Override public Node clone() {
		return new Node(this.id);
	}

	public void Connect(Edge e) {
		edges.add(e);
	}
}

class Edge{
	Node v1, v2;
	int cost;
	public Edge(Node id1,Node id2, int c) {
		this.v1 = id1;
		this.v2 = id2;
		this.cost = c;
		v1.Connect(this);
		v2.Connect(this);
	}

	public Node First_one() {
		return this.v1;
	}

	public Node Second_one() {
		return this.v2;
	}

	public Node Other_one(Node v) {
		if(v.equals(this.v1)) {
			return this.v2;
		}
		else {
			return this.v1;
		}
	}
}

class MyComparator implements Comparator<Node>{
	@Override public int compare(Node u,Node v) {

		int num1 = u.id;
		int num2 = v.id;
		if(num1 > num2) {
			return 1;
		}
		else if(num1 < num2) {
			return -1;
		}
		else {
			return 0;
		}
	}
}

class Graph{
	static Node[] nodes;
	static Edge[] edges;

	public Graph(Node[] v,Edge[] e) {
		Graph.nodes = v;
		Graph.edges = e;
	}

	public static int size() {
		return nodes.length;
	}

	public boolean Bellman_Ford(Node s) {
		boolean negative_loop[] = new boolean[size()];
		Arrays.fill(negative_loop, false);
		s.Reload_dist(0);
		for(int i=0;i<size();i++) {
			for(Node v : nodes) {
				for(Edge e : v.edges) {
					if((v.d != Long.MAX_VALUE && e.Other_one(v).d > v.d + e.cost)) {
						e.Other_one(v).Reload_dist(v.d + e.cost);
						negative_loop[e.Other_one(v).id] = true;
					}
					if(i==size()-1) {
						return true;
					}
				}
			}
		}
		return false;
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