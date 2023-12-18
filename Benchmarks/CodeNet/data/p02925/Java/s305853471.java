import java.io.*;
import java.util.*;

class CP {
	public static void main(String[] args) throws Exception {
		IO io = new IO(System.in, System.out);
		int i, j, k;
		
		Comparator<int[]> com = new Comparator<int[]>() {
			@Override
			public int compare(int[] a, int[] b) {
				for (int i = a.length - 1; i >= 0; --i) if (a[i] != b[i]) 
					return Integer.compare(a[i], b[i]);
				return 0;
			}
		};
		
	
		int N = io.nextInt();
		TreeSet<int[]>[] graph = new TreeSet[N];
		for (i = 0; i < N; ++i) graph[i] = new TreeSet<>(com);
		
		for (i = 0; i < N; ++i) for (j = 0; j < N - 1; ++j) {
			int[] edge = new int[] {i, io.nextInt() - 1, j};
			graph[i].add(edge);
		}
		
		int match = 0;
		HashSet<Integer> exc = new HashSet<>(), participating = new HashSet<>();
		HashSet<Integer> rem = new HashSet<>();
		for (i = 0; i < N; ++i) participating.add(i);
		
		for (i = 0; ; ++i) {
			exc.clear();
			boolean ok = false;
			rem.clear();
			
			for (int itr : participating) if (!exc.contains(j = itr)) {
				int oth = graph[j].first() [1];
				if (!exc.contains(oth) && graph[oth].first() [1] == j) {
					ok = true;
					graph[j].pollFirst();
					graph[oth].pollFirst();
					
					if (graph[j].isEmpty()) rem.add(j);
					if (graph[oth].isEmpty()) rem.add(oth);
					
					exc.add(j); exc.add(oth);
					++match;
					
					//System.err.print("PPP: " + j + " " + oth + "   ");
				}
			}
			
			participating.removeAll(rem);
			
			if (!ok) {
				if (match == N * (N - 1) >> 1) {
					System.out.println(i);
				} else {
					System.out.println(-1);
				}
				return;
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