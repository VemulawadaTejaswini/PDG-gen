import java.io.*;
import java.util.*;
/**
 * Main
 */
public class Main {
        static Stack<Integer> subset = new Stack<>();
        static String input = "";
        static int stop = 0;
        static int mod  = 1000000007;
        static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        static HashMap<Integer,Integer> map = new HashMap<>();
        static ArrayList<String> list = new ArrayList<>();
    public static void main(String[] args) {
       MyScanner ms  = new MyScanner();
        int N = ms.nextInt();
        double [] coins = new double[N];
        for(int i=0;i<coins.length;i++)
        coins[i] = ms.nextDouble();
        double [][] dp = new double[N+1][N+1];
        dp[0][0] =1;
        double sum =0;
        for(int i=1;i<=N;i++)
        dp[0][i] = 0;
        int mid = N/2;
        for(int i=1;i<=N;i++){
            for(int col=0;col<=N;col++){
                if(col==0){
                    dp[i][col] = dp[i-1][col]*(1-coins[i-1]);
                }else {
                    //to go hte top left get the value of desciding not and acino doin 
                    //adnd up to fligign the i-1 coin to get head and it own not to do 
                    dp[i][col] = (dp[i-1][col-1]*(coins[i-1]))
                    +(dp[i-1][col]*(1-coins[i-1]));
                    if(i==N&&col>mid)
                    sum+=dp[i][col];
                    
                }
            }
        }
       pw.println(sum);
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