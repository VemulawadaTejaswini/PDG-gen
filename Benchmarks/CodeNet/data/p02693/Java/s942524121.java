import java.io.*;
import java.util.*;
public class Main implements Runnable {
    public void solve() throws Exception {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int k = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        boolean flag = false;
        for (int i = a; i <= b; i++) {
            if (i%k==0){
                flag = true;
                break;
            }
        }
        out.println(flag?"OK":"NG");
    }

    //main function//
    public static PrintWriter out;
    public static void main(String[] args) throws Exception {
        new Thread(null, new Main(), "", 1 << 26).start();
    }
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

        String nextLine(){
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

    }
    public void run() {
        try {
           solve();
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        } finally {
            out.close();
        }
    }
}
