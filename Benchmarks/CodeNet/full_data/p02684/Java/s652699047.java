import java.io.*;
import java.util.*;
/**
 * Main
 */
public class Main {
       static int mod  = 1000000007;
        static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) {
       MyScanner ms  = new MyScanner();
       long N = ms.nextLong();
       long K = ms.nextLong();
       int [] arr = new int[(int)N+1];
       for(int i=1;i<=N;i++)
       arr[i]  = ms.nextInt();
       BitSet bs = new BitSet((int)N+1);
       bs.set(1,true);
       int j=arr[1];
       int [] mod = new int[(int)N];
       int k=0;
       mod[k] = j;
       while(!bs.get(j)){
            bs.set(j, true);
            j = arr[j];
            mod[++k] = j;
       }
       int sizeOfTheCYle = k+1;
       System.out.println(mod[(int)(K%N)]);
      

    pw.flush();

    }public static class MyScanner {
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
}