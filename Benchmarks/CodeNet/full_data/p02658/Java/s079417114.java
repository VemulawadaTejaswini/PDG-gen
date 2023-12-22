import java.io.*;
import java.math.*;
import java.util.*;



public class Main {

    static MyScanner ob = new MyScanner();
    static   PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
    static int N ;
    static int [] A;
     static char[][] arr = new char[100][1000];
    public static void main(String args[]) throws IOException {
       int N = ob.nextInt();
       long [] arr = new long[N];
       boolean zero = false;
       for(int i=0;i<N;i++){
           arr[i] = ob.nextLong();
           if(arr[i]==0){
               zero = true;
           }
       }
       long max = 10;
       for(int i=0;i<17;i++){
           max*=10;
       }
       if(zero){
           pw.println(0);
       }else{
           boolean overflow = false;
           long prod = 1;
        for(int i=0;i<N;i++){
            if(arr[i]<=max/prod){
                prod*=arr[i];
            }else{
                overflow = true;
            }
        }
        pw.println(overflow?"-1":prod);
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