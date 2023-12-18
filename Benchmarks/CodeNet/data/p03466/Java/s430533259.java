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
            boolean chk(int a,int b,int p){
             if(a<0||b<0)return false;
             if(cal(a,b)<=p)return true;return false;
            }
            int cal(int a,int b){
             return (int)Math.ceil((double)Math.max(a,b)/(double)(Math.min(a,b)+1));
            }
         public void solve(int testNumber, InputReader in, PrintWriter out) {
             int n=in.nextInt();
             while(n-->0){
              int a=in.nextInt(),b=in.nextInt(),c=in.nextInt(),d=in.nextInt();
              int k=cal(a,b);//System.out.println(k+" k");
              int l=0,r=c-1;int ans=0;
              while(l<=r){
               int m=(l+r)>>1;
               if(chk(m,c-1-m,k)&&chk(a-m,b-(c-1-m),k)){
                ans=m;l=m+1;
               }else r=m-1;
              }//System.out.println(ans+" ans");
              int la=a-ans,lb=b-(c-1-ans);int nb=0,na=0;
              if(chk(la,lb+1,k)&&chk(ans,c-1-ans-1,k)){
               int L=1,R=c-1;
               while(L<=R){
                int m=(L+R)>>1;
                if(chk(la,lb+m,k)&&chk(ans,c-1-ans-m,k)){
                 nb=m;L=m+1;
                }else R=m-1;
               }
              }else if(chk(la+1,lb,k)&&chk(ans-1,c-1-ans,k)){
               int L=1,R=c-1;
               while(L<=R){
                int m=(L+R)>>1;
                if(chk(la+m,lb,k)&&chk(ans-m,c-1-ans,k)){
                 na=m;R=m-1;
                }else L=m+1;
               }
               if(ans==c-1)na=ans;
              }//System.out.println(na+" "+nb);
              for(int i=0;i<=d-c;i++){
               if(chk(la-1,lb,k)&&na+1<=k){
                out.print("A");++na;nb=0;--la;
               }else{
                out.print("B");++nb;na=0;--lb;
               }
              }out.println();
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