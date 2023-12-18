    import java.io.*;
    import java.util.StringTokenizer;

    public class Main {

        private static void solver(InputReader sc, PrintWriter out) {
            int k = sc.nextInt();
            int n =  sc.nextInt();
            int arr[] = new int[n];
            boolean flag = false;
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
                if(arr[i]==0){
                    flag = true;
                }
            }
            if(flag) {
                long ans =0;
                ans += k-arr[n-1];
               // out.println(ans);
                for(int i=0;i+1<n-1;i++){
                    ans += arr[i+1]-arr[i];
                }
                out.println(ans);
            }
            else{
                long ans=0;
                for(int i=0;i+1<n;i++){
                    ans += arr[i+1]-arr[i];
                 //   out.println(ans);
                }
                out.println(ans);
            }
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
