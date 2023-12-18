import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        FastScanner in = new FastScanner();
        int A = in.nextInt();
        int B = in.nextInt();
        int K = in.nextInt();

        int smallest [] = new int[K];
        int largest [] = new int [K];
        int combined [] = new int [K+K];

        for (int i = 0; i < K; i++)
        {
            smallest[i] = A+i;
        }
        for (int i = 0; i < K; i++)
        {
            largest[i] = B-i;
        }

        for (int i =0; i < smallest.length;i++)
        {
            combined [i] = smallest[i];
        }
        for (int i =0; i < largest.length;i++)
        {
            combined [i] = smallest[i];
        }

        int ToPrint [] = new int [smallest.length + largest.length];
        ToPrint[0] = combined[0];
        for (int i = 1 ; i<combined.length; i++)
        {
            if (combined[i] != ToPrint[i-1])
            {
                ToPrint[i] = combined[i];
            }
        }
        for (int i = 0; i <ToPrint.length; i++)
        {
            System.out.println(ToPrint[i]);
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
