import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskE solver = new TaskE();
        solver.solve(1, in, out);
        out.flush();out.close();
    }
        static class TaskE {
         String s1="Vacant",s2="Male",s3="Female";
         int get(int l,int rf){
          if(l%2==0)return rf;else return 1-rf;
         }
         public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n=in.nextInt();
            System.out.println(0);
            String s=in.next().trim();
            if(s.equals(s1)){
             return;
            }
            int r=0;
            if(s.equals(s2))r=1;
            int L=1,R=n-1;
            while(L<=R){
             int m=(L+R)>>1;
             System.out.println(m);
             String is=in.next().trim();
             int sh=get(m,r);
             if(is.equals(s1))return;
             if(is.equals(s2)){
              if(sh==1)L=m+1;
              else r=m;
             }else{
              if(sh==0)L=m+1;
              else r=m;
             }
            }
         }
    }
    static class InputReader {
        BufferedReader br;
        StringTokenizer st;
        public InputReader(InputStream stream) {
            br = new BufferedReader(new InputStreamReader(stream));
            st = null;
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                String s = null;
                try {
                    s = br.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (s == null)
                    return null;
                st = new StringTokenizer(s);
            }
            return st.nextToken();
        }

        boolean hasMoreTokens() {
            while (st == null || !st.hasMoreTokens()) {
                String s = null;
                try {
                    s = br.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (s == null)
                    return false;
                st = new StringTokenizer(s);
            }
            return true;
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }
        public long nextLong() {
            return Long.parseLong(next());
        }
        public double nextDouble() {
            return Double.parseDouble(next());
        }
    }
}