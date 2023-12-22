import java.io.*;
import java.util.*;



public class Main {

    static MyScanner ob = new MyScanner();
    static   PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
    static int N ;
    static int [] A;
     static char[][] arr = new char[100][1000];
    public static void main(String args[]) throws IOException {
     int N = ob.nextInt();
     long sum =1; 
     long max  = 10;
     for(int i=0;i<17;i++){
         max*=10;
     }
     boolean overflow= false;
     for(int i=0;i<N;i++){
         long u = ob.nextLong();
         sum*=u;
        
     }
     if(sum>max){
        overflow = true;
      }
    if(overflow||sum<0){
        pw.println(-1);
    }else{
    pw.println(sum);
    }
     pw.flush();
        
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
}