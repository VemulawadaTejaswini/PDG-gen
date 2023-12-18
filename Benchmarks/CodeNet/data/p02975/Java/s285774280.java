import java.io.*;
import java.util.*;
public class Main{
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
            int n = in.nextInt();
            int x = 0;
            for(int i = 0; i < n; i++)x ^= in.nextInt();
            out.println((x == 0 ? "Yes" : "No"));
          }
//         pair ja[][];long w[];int from[],to[],c[];
//             void make(int n,int m,InputReader in){
//              ja=new pair[n+1][];w=new long[m];from=new int[m];to=new int[m];c=new int[n+1];
//              for(int i=0;i<m;i++){
//               int u=in.nextInt(),v=in.nextInt();long wt=in.nextLong();
//               c[u]++;c[v]++;from[i]=u;to[i]=v;w[i]=wt;
//              }
//              for(int i=1;i<=n;i++){
//               ja[i]=new pair[c[i]];c[i]=0;
//              }
//              for(int i=0;i<m;i++){
//               ja[from[i]][c[from[i]]++]=new pair(to[i],w[i]);
//               ja[to[i]][c[to[i]]++]=new pair(from[i],w[i]);
//              }
//             }
//        int[] radixSort(int[] f){ return radixSort(f, f.length); }
//    int[] radixSort(int[] f, int n)
//    {
//        int[] to = new int[n];
//        {
//            int[] b = new int[65537];
//            for(int i = 0;i < n;i++)b[1+(f[i]&0xffff)]++;
//            for(int i = 1;i <= 65536;i++)b[i]+=b[i-1];
//            for(int i = 0;i < n;i++)to[b[f[i]&0xffff]++] = f[i];
//            int[] d = f; f = to;to = d;
//        }
//        {
//            int[] b = new int[65537];
//            for(int i = 0;i < n;i++)b[1+(f[i]>>>16)]++;
//            for(int i = 1;i <= 65536;i++)b[i]+=b[i-1];
//            for(int i = 0;i < n;i++)to[b[f[i]>>>16]++] = f[i];
//            int[] d = f; f = to;to = d;
//        }
//        return f;
//    }
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