import java.io.*;
import java.util.StringTokenizer;



public class Main {
    public static void main(String[] args) throws IOException {
        FastScanner in = new FastScanner();
        int N = in.nextInt();

        String num = Integer.toString(N);

        char num1 = num.charAt(0);
        char num2 = num.charAt(1);
        char num3 = num.charAt(2);
        char num4 = num.charAt(3);


        if (num1 == num2 && num1 == num3)
        {
            System.out.println("Yes");
            System.exit(0);
        }
        if (num2 == num3 && num2 == num4)
        {
            System.out.println("Yes");
            System.exit(0);
        }
        else
            {
                System.out.println("No");
            }

    }

    public static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(String s) {
            try {
                br = new BufferedReader(new FileReader(s));
            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        public FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String nextToken() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        String nextLine() {
            st = null;
            try {
                return br.readLine();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            return null;
        }

        int nextInt() {
            return Integer.parseInt(nextToken());
        }

        long nextLong() {
            return Long.parseLong(nextToken());
        }

        double nextDouble() {
            return Double.parseDouble(nextToken());
        }
    }
}
