import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        ///////////////////////////////////////////////////
        int n = in.nextInt();
        int k = in.nextInt();
        String[] hate = new String[k];
        for (int i = 0; i < k; i++) {
            hate[i] = in.next();
        }
        for (int i = n; ; i++) {
            String b = Integer.toString(i);
            boolean flag = true;
            for (String m : hate) {
                if (b.contains(m)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(b);
                return;
            }
        }


        ////////////////////////////////
//        out.println();
//        out.flush();
    }

    static class Scanner {
        StringTokenizer tokenizer;
        BufferedReader reader;

        public Scanner(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream));
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

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public String nextLine() throws IOException {
            return reader.readLine();
        }

        public boolean ready() throws IOException {
            return reader.ready();
        }
    }
}




