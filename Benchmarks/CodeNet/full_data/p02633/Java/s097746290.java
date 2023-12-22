// This code is contributed by Princi Singh 
 
/* package whatever; // don't place package name! */
 
import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

/* Name of the class has to be "Main" only if the class is public. */
 
public class Main {

    public static void main(String[] args) {
        InputStream inputStream;
        if (args.length > 0 && args[0].equals("devTesting")) {
	    try {
	        inputStream = new FileInputStream(args[1]);
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
           }
        } else {
           inputStream = System.in;
        }
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Task solver = new Task();
        solver.solve(args, 0, in, out);
        out.close();
    }

    static class Task {
		
        void solve(String[] args, int testNumber, InputReader in, PrintWriter out) {
 
            double x = in.nextDouble();
            
            int ans = (int) Math.ceil(360. / x);
            out.println(ans); 
        }

        int i(long x) {
            return (int) x;
        }
 
        <T> void heapsort(T[] a, int s, int e) {
            Queue<T> queue = new PriorityQueue<>();
            for (int i = s; i <= e; ++i) {
                queue.add(a[i]);
            }
            for (int i = s; i <= e; ++i) {
                a[i] = queue.poll();
            }
        }
 
    }
 
    static class InputReader {
 
        public BufferedReader reader;
        public StringTokenizer tokenizer;
 
        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream));
            tokenizer = null;
        }
 
        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }
 
        public String nextLine() {
            try {
                return reader.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
 
        public int nextInt() {
            return Integer.parseInt(next());
        }
 
        public long nextLong() {
            return Long.parseLong(next());
        }
 
        public double nextDouble() {
            return Double.parseDouble(next());
        }
 
        public boolean hasInput() {
            try {
                if (tokenizer != null && tokenizer.hasMoreTokens()) {
                    return true;
                }
                reader.mark(1);
                int ch = reader.read();
                if (ch != -1) {
                    reader.reset();
                    return true;
                }
                return false;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
 
    }
}
