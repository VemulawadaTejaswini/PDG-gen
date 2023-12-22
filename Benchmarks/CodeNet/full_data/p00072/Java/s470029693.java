
import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;
public class Main {
	static int V;
	static int E;
	static Edge[] es;
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		
		while(true) {
			int n = sc.nextInt();
			if(n == 0) break;
			V = n;
			int m = sc.nextInt();
			E = m;
			es = new Edge[E];
			for(int i = 0; i < m; i++) {
				String[] tmp = sc.next().split(",");
				int a = Integer.parseInt(tmp[0]);
				int b = Integer.parseInt(tmp[1]);
				int c = Integer.parseInt(tmp[2]);
				
				es[i] = new Edge(a,b,c);
			}
			
			int ret = kruskal();
			
			ret -=  (n-1)*100;
			System.out.println(ret / 100);
		}
	}
	
	public static int kruskal() {
		Arrays.sort(es,new Comp());
		init(V);
		int res = 0;
		for (int i = 0; i < E; i++) {
			Edge e = es[i];
			if(!same(e.u,e.v)) {
				unite(e.u,e.v);
				res += e.cost;
			}
		}
		return res;
	}
	
	static int[] par ;
	static int[] rank ;
	
	static void init(int n) {
		par = new int[V];
		rank = new int[V];
		for(int i = 0; i < n; i++) {
			par[i] = i;
			rank[i] = 0;
		}
	}
	
	static int find(int x) {
		if(par[x] == x) {
			return x;
		}
		else {
			return par[x] = find(par[x]);
		}
	}
	
	static void unite(int x, int y) {
		x = find(x);
		y = find(y);
		if(x == y) return;
		
		if(rank[x] < rank[y]) {
			par[x] = y;
		}
		else {
			par[y] = x;
			if(rank[x] == rank[y]) rank[x]++;
		}
		
	}
	
	static boolean same(int x, int y) {
		return find(x) == find(y);
	}
	

}


class Edge {
	int u;
	int v;
	int cost;
	Edge(int a, int b, int c) {
		u = a;
		v = b;
		cost = c;
	}
}

class Comp implements Comparator<Edge> {

	public int compare(Edge o1, Edge o2) {
		return o1.cost - o2.cost;
	}
	
}
//------------------------------//
//-----------//
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
    	return (int)nextLong();
    }
    

}