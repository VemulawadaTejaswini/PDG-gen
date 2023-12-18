
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main implements Runnable {

    public static String reverse(String s)
    {
        return new StringBuilder(s).reverse().toString();
    }
    public static boolean isPal(String s){
       String s1 = reverse(s);
       if (s.equals(s1)){
           return true;
       }
       return false;
    }
    public void solve() throws Exception {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
           String s = sc.nextLine();
           int len = s.length();
           String s1 = s.substring(0,((len-1)/2));
           String s2 = s.substring(((len+1)/2));

           boolean flag1 = isPal(s);
           boolean flag2 = isPal(s1);
           boolean flag3 = isPal(s2);

        if (flag1 && flag2 && flag3){
            out.println("Yes");
        }else
            out.println("No");
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

        boolean hasNextInt() {
            return true;
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