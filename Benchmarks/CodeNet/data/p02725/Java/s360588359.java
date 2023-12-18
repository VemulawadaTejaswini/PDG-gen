    import java.io.*;
    import java.util.StringTokenizer;

    public class Main {

        private static void solver(InputReader sc, PrintWriter out) {
            int k = sc.nextInt();
            int n =  sc.nextInt();
            int arr[] = new int[n];
            int count=0; long sum=0;
            for(int i=0;i<n;i++) {
                arr[i] = sc.nextInt();
                sum += arr[i];
                if(arr[i]!=0)
                    count++;
            }
            out.println(sum/count);
        }

        public static void main(String[] args) {
            InputStream inputStream = System.in;
            OutputStream outputStream = System.out;
            InputReader in = new InputReader(inputStream);
            PrintWriter out = new PrintWriter(outputStream);
            solver(in, out);
            out.close();
        }
        static class InputReader {
            public BufferedReader reader;
            public StringTokenizer tokenizer;

            public InputReader(InputStream stream) {
                reader = new BufferedReader(new InputStreamReader(stream), 32768);
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

            public int nextInt() {
                return Integer.parseInt(next());
            }
            public long nextLong() {
                return Long.parseLong(next());
            }
        }
    }
