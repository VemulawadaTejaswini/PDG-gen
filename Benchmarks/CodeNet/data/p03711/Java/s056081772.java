
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        FastScanner in = new FastScanner();
        int X = in.nextInt();
        int Y = in.nextInt();



        List<Integer> group1 = new ArrayList<>();
        List<Integer> group2 = new ArrayList<>();
        group1.add(1);
        group1.add(3);
        group1.add(5);
        group1.add(7);
        group1.add(8);
        group1.add(10);
        group1.add(1);
        group2.add(4);
        group2.add(6);
        group2.add(9);
        group2.add(11);

        if (X==2 && Y == 2)
        {
            System.out.println("Yes");
        }

        else if (group1.contains(X) && group1.contains(Y))
        {
            System.out.println("Yes");
        }

        else if (group2.contains(X) && group2.contains(Y))
        {
            System.out.println("Yes");
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
