import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        FastReader sc=new FastReader();
        Long a=sc.nextLong();
        Long b=sc.nextLong();
        Long c=sc.nextLong();
        Long d=sc.nextLong();
        Long ans1=a*c;
        Long ans2=a*d;
        Long ans3=b*c;
        Long ans4=b*d;
       // System.out.println(ans1);
      //  System.out.println(ans2);
       // System.out.println(ans3);
      //  System.out.println(ans4);
        System.out.println(Math.max(Math.max(ans1,ans2),Math.max(ans3,ans4)));

    }
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
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

}
