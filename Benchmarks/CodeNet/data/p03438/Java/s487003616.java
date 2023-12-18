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
            long a[]=new long[n],b[]=new long[n];
            for(int i=0;i<n;i++)a[i]=in.nextLong();
            for(int i=0;i<n;i++)b[i]=in.nextLong();
            long n1=0,n2=0;
            for(int i=0;i<n;i++){
             if(a[i]<b[i]){
              if((b[i]-a[i])%2!=0){
               n1++;n2+=(b[i]-a[i]+1)/2;
              }else n2+=(b[i]-a[i])/2;
             }else if(b[i]<a[i]){
              n1+=a[i]-b[i];
             }
            }//System.out.println(n1+" "+n2);
            if(n2>=n1)out.print("Yes");else out.print("No");
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