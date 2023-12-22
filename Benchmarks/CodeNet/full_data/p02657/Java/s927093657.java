import java.io.*;
import java.util.*;



public class Main {

    static MyScanner ob = new MyScanner();
    static   PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
    static int N ;
    static int [] A;
     static char[][] arr = new char[100][1000];
    public static void main(String args[]) throws IOException {
     int A = ob.nextInt(); int B = ob.nextInt();
     pw.println(A*B);
        
      pw.flush();
        
    }

  
    static boolean check (int i, int j,int n ,int m){
        if(j+1<m){
            if(arr[i][j]=='.'&&arr[i][j+1]=='.'){
                return true;
            }
            return false;
        }
        return false;
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