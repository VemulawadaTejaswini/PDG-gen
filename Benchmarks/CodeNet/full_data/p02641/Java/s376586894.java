import java.util.*; 
import java.io.*;

public class Main{
    static StringTokenizer st;
    static BufferedReader br;  
    static PrintWriter out;
 
    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
 
        int X = nextInt();
        int N= nextInt();

        boolean[] forbiddenList = new boolean[100+1];
        for (int x=1; x<=N; x++) { //1≤pi≤100
            forbiddenList[nextInt()]  = true;
        }
        forbiddenList[X]  = true;  //find the integer nearest to X

        int min = Integer.MAX_VALUE;
        int index = 0 ;
         
        // not necessarily positive
        for (int i=0; i<=100; i++) {
            if( i < 1 || forbiddenList[i] == false){
                if(min > Math.abs(X-i)){
                    min = Math.abs(X-i);
                    index = i;
                } 
                else if(min == Math.abs(X-i)){
                    index = Math.min(index,i);
                } 

            }
  
        }

        System.out.println(index);
    }
    
      
    public static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }
    public static long nextLong() throws IOException {
        return Long.parseLong(next());
    }

    public static double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine().trim());
        return st.nextToken();
    }
}