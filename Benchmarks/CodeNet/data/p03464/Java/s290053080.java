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
         public void solve(int testNumber, InputReader in, PrintWriter out) {
             int n=in.nextInt();
             long a[]=new long[n];
             for(int i=0;i<n;i++)a[i]=in.nextInt();
             long l=2,r=2;boolean rs=true;
             for(int i=n-1;i>=0;i--){
              long hi=r/a[i],lo=l%a[i]==0?l/a[i]:l/a[i]+1;
              l=lo*a[i];r=hi*a[i];//System.out.println(l+" "+r+" i");
              if(l>r){
               rs=false;break;
              }r=(hi+1)*a[i]-1;//System.out.println(l+" "+r);
             }if(rs){
              out.print(l+" "+r);
             }else out.print("-1");
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