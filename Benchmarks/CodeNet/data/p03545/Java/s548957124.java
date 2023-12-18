import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        FastScanner in = new FastScanner();
        int N = in.nextInt();
        String newN = Integer.toString(N);

        int newA = N/1000;
        int newB = N/100;
        newB = newB%10;
        int newC = N/10;
        newC = newC%10;
        int newD = N%10;

        if (newA+newB+newC+newD==7)
        {
            System.out.println(newA + "+" + newB + "+" + newC +  "+" + newD + "=7" );
            System.exit(0);
        }

        if (newA+newB+newC-newD==7)
        {
            System.out.println(newA + "+" + newB + "+" + newC +  "-" + newD + "=7" );
            System.exit(0);
        }

        if (newA+newB-newC-newD==7)
        {
            System.out.println(newA + "+" + newB + "-" + newC +  "-" + newD + "=7" );
            System.exit(0);
        }

        if (newA-newB+newC+newD==7)
        {
            System.out.println(newA + "-" + newB + "+" + newC +  "+" + newD + "=7" );
            System.exit(0);
        }
        if (newA-newB-newC+newD==7)
        {
            System.out.println(newA + "-" + newB + "-" + newC +  "+" + newD + "=7" );
            System.exit(0);
        }
        if (newA-newB+newC-newD==7)
        {
            System.out.println(newA + "-" + newB + "+" + newC +  "-" + newD + "=7" );
            System.exit(0);
        }
        if (newA-newB-newC-newD==7)
        {
            System.out.println(newA + "-" + newB + "-" + newC +  "-" + newD + "=7" );
            System.exit(0);
        }
        if (newA+newB-newC+newD==7)
        {
            System.out.println(newA + "+" + newB + "-" + newC +  "+" + newD + "=7" );
            System.exit(0);
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
