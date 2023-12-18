import java.io.*;
import java.util.*;

public class Main {
	static int N;
	static ArrayDeque<Integer>[] graph;

	public static void main(String[] args) throws Exception {
		IO io = new IO(System.in, System.out);
		int i, j, k;
	
		N = io.nextInt();
		graph = new ArrayDeque[N];
		for (i = 0; i < N; ++i) graph[i] = new ArrayDeque<>();
		
		for (i = 0; i < N; ++i) for (j = 0; j < N - 1; ++j) {
			graph[i].add(io.nextInt() - 1);
		}
		
		new Solver().solve(N, graph);
	}
}

class Solver {
	void solve(int N, ArrayDeque<Integer>[] graph) throws Exception {
		int i, j, k;
		
		int match = 0;
		BitSet participating = new BitSet(), exc = new BitSet();
		participating.set(0, N);
		
		for (i = 0; ; ++i) {
			exc.clear(0, N);
			boolean ok = false;
			
			for (j = participating.nextSetBit(0); j >= 0; j = participating.nextSetBit(j + 1)) if (!exc.get(j)) {
				int oth = graph[j].peekFirst();
				if (!exc.get(oth) && graph[oth].peekFirst() == j) {
					ok = true;
					graph[j].pollFirst();
					graph[oth].pollFirst();
					
					if (graph[j].isEmpty()) participating.clear(j);
					if (graph[oth].isEmpty()) participating.clear(oth);
					
					exc.set(j); exc.set(oth);
					++match;
					
					//System.err.print("PPP: " + j + " " + oth + "   ");
				}
			}
			
			if (!ok) {
				if (match == N * (N - 1) >> 1) {
					System.out.println(i);
				} else {
					System.out.println(-1);
				}
				
				System.exit(0);
			}
			//System.err.println();
		}
 	}
}




class IO {
    static byte[] buf = new byte[2048];
    static int index, total;
    static InputStream in;
    static BufferedWriter bw;


    IO(InputStream is, OutputStream os) {
        try {
            in = is;
            bw = new BufferedWriter(new OutputStreamWriter(os));
        } catch (Exception e) {
        }
    }

    IO(String inputFile, String outputFile) {
        try {
            in = new FileInputStream(inputFile);
            bw = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream(outputFile)));
        } catch (Exception e) {
        }
    }

    int scan() throws Exception {
        if (index >= total) {
            index = 0;
            total = in.read(buf);
            if (total <= 0)
                return -1;
        }
        return buf[index++];
    }

    String next() throws Exception {
        int c;
        for (c = scan(); c <= 32; c = scan()) ;
        StringBuilder sb = new StringBuilder();
        for (; c > 32; c = scan())
            sb.append((char) c);
        return sb.toString();
    }

    int nextInt() throws Exception {
        int c, val = 0;
        for (c = scan(); c <= 32; c = scan()) ;
        boolean neg = c == '-';
        if (c == '-' || c == '+')
            c = scan();
        for (; c >= '0' && c <= '9'; c = scan())
            val = (val << 3) + (val << 1) + (c & 15);
        return neg ? -val : val;
    }
    long nextLong() throws Exception {
        int c;
        long val = 0;
        for (c = scan(); c <= 32; c = scan()) ;
        boolean neg = c == '-';
        if (c == '-' || c == '+')
            c = scan();
        for (; c >= '0' && c <= '9'; c = scan())
            val = (val << 3) + (val << 1) + (c & 15);
        return neg ? -val : val;
    }
    void print(Object a) throws Exception {
        bw.write(a.toString());
    }
    void println() throws Exception {
        bw.write("\n");
    }
    void println(Object a) throws Exception {
        print(a);
        println();
    }
    void flush() throws Exception {
        bw.flush();
        bw.close();
    }
}