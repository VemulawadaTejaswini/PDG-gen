import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        InputReader in = new InputReader();
        //InputStream inputStream = System.in;
        //Scanner in = new Scanner(inputStream);
        OutputStream outputStream = System.out;
        PrintWriter out = new PrintWriter(outputStream);
        long mod = (int)1e9+7;
        int n = in.nextInt();
        int[] arr = new int[3*n];
        for(int i=0;i<3*n;i++)
            arr[i] = in.nextInt();
        Arrays.sort(arr);
        long ans = 0;
        int right = 3*n-1;
        int left = 0;
        while(left<right){
            ans+=arr[right-1];
            left++;
            right-=2;
        }
        out.println(ans);
        out.close();
    }

    static class InputReader {
        BufferedReader br;
        StringTokenizer st;

        public InputReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    throw new RuntimeException();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                throw new RuntimeException();
            }
            return str;
        }
    }
}
