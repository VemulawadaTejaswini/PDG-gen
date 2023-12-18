import java.io.*;
import java.util.*;

public class Main implements Runnable {
	public static void main (String[] args) {new Thread(null, new Main(), "_cf", 1 << 28).start();}

	public void run() {
		FastScanner fs = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		System.err.println("");

		int N = fs.nextInt();
		int Q = fs.nextInt();
		Event[] events = new Event[2*N+Q];
		int ptr = 0;
		for(int i = 0; i < N; i++) {
			int S = fs.nextInt();
			int E = fs.nextInt();
			int X = fs.nextInt();
			events[ptr++] = new Event(S-X, 0, X);
			events[ptr++] = new Event(E-X-1, 2, X);
		}
		for(int i = 0; i < Q; i++) {
			int X = fs.nextInt();
			events[ptr++] = new Event(X, 1, i);
		}
		Arrays.sort(events);
		int[] res = new int[Q];
		TreeMap<Integer, Integer> map = new TreeMap<>();
		for(Event e : events) {
			if(e.type == 0) {
				add(map, e.value);
			}
			else if(e.type == 2) {
				del(map, e.value);
			}
			else {
				if(map.isEmpty()) res[e.value] = -1;
				else res[e.value] = map.firstKey(); 
			}
		}
		for(int i = 0; i < Q; i++) out.println(res[i]);

		out.close();
	}

	void add(TreeMap<Integer, Integer> map, int x) {
		if(!map.containsKey(x)) map.put(x, 0);
		map.put(x, map.get(x)+1);
	}

	void del(TreeMap<Integer, Integer> map, int x) {
		int fr = map.get(x)-1;
		if(fr == 0) map.remove(x);
		else map.put(x, fr);
	}


	class Event implements Comparable<Event> {
		int type;
		int x, value;
		Event(int xx, int t, int v) {
			x = xx;
			type = t;
			value = v;
		}
		public int compareTo(Event e) {
			int comp = Integer.compare(x, e.x);
			if(comp == 0) {
				comp = Integer.compare(type, e.type);
			}
			return comp;
		}
	}

	class FastScanner {
		public int BS = 1<<16;
		public char NC = (char)0;
		byte[] buf = new byte[BS];
		int bId = 0, size = 0;
		char c = NC;
		double num = 1;
		BufferedInputStream in;

		public FastScanner() {
			in = new BufferedInputStream(System.in, BS);
		}

		public FastScanner(String s) {
			try {
				in = new BufferedInputStream(new FileInputStream(new File(s)), BS);
			}
			catch (Exception e) {
				in = new BufferedInputStream(System.in, BS);
			}
		}

		public char nextChar(){
			while(bId==size) {
				try {
					size = in.read(buf);
				}catch(Exception e) {
					return NC;
				}                
				if(size==-1)return NC;
				bId=0;
			}
			return (char)buf[bId++];
		}

		public int nextInt() {
			return (int)nextLong();
		}

		public long nextLong() {
			num=1;
			boolean neg = false;
			if(c==NC)c=nextChar();
			for(;(c<'0' || c>'9'); c = nextChar()) {
				if(c=='-')neg=true;
			}
			long res = 0;
			for(; c>='0' && c <='9'; c=nextChar()) {
				res = (res<<3)+(res<<1)+c-'0';
				num*=10;
			}
			return neg?-res:res;
		}

		public double nextDouble() {
			double cur = nextLong();
			return c!='.' ? cur:cur+nextLong()/num;
		}

		public String next() {
			StringBuilder res = new StringBuilder();
			while(c<=32)c=nextChar();
			while(c>32) {
				res.append(c);
				c=nextChar();
			}
			return res.toString();
		}

		public String nextLine() {
			StringBuilder res = new StringBuilder();
			while(c<=32)c=nextChar();
			while(c!='\n') {
				res.append(c);
				c=nextChar();
			}
			return res.toString();
		}

		public boolean hasNext() {
			if(c>32)return true;
			while(true) {
				c=nextChar();
				if(c==NC)return false;
				else if(c>32)return true;
			}
		}

		public int[] nextIntArray(int n) {
			int[] res = new int[n];
			for(int i = 0; i < n; i++) res[i] = nextInt();
			return res;
		}

	}

}