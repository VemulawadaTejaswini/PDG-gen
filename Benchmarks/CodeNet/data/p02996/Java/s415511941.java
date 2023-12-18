import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        MyScanner scan = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));

        int n = scan.nextInt();
        int[][] vals = new int[n][2];
        for (int i = 0; i < n; i++) {
            vals[i][0] = scan.nextInt();
            vals[i][1] = scan.nextInt();
        }

        Arrays.sort(vals, (o1, o2) -> {
            return (o1[1]) - (o2[1]);
        });
        int time = 0;
        for (int i = 0; i < n; i++) {
            if (time + vals[i][0] <= vals[i][1]) {
                time += vals[i][0];
            } else {
                out.println("No");
                out.close();
                return;
            }
        }
        out.println("Yes");
        out.close();
    }


    //-----------PrintWriter for faster output---------------------------------
    public static PrintWriter out;

    //-----------MyScanner class for faster input----------
    public static class MyScanner {
        BufferedReader br;
        StringTokenizer st;

        public MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
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
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

    }
    //--------------------------------------------------------

}