import java.io.*;
import java.math.*;
import java.util.*;





public class Main {

    static MyScanner in = new MyScanner();
    static   PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
    int N;
    static int [] dr = {1,-1,0,0};
    static int [] dc={0,0,-1,1};
    static int []  a;
    static long max = 10000000;
    static int INF = 10000000;
    public static void main(String args[]) throws IOException {
        int N = in.nextInt();
          a = new int[N];
        for(int i=0;i<N;i++){
            a[i] = in.nextInt();
        }
        long [][] dp = new long [405][405];
        for(int L = N-1;L>=0;--L){
            for(int R = L;R<N;++R){
                if(L==R)
                dp[L][R] = 0;
                else{
                    dp[L][R] = INF;
                    for(int i=L;i<=R-1;i++)
                    dp[L][R] = Math.min(dp[L][R], dp[L][i]+dp[i+1][R]+sum(L, R));
                }
            }
        }
        out.println(dp[0][N-1]);



        out.flush();
        }
        static long sum(int L , int R){
            long sum =0;
            for(int i=L;i<=R;i++){
                sum+=a[i];
            }
            return sum;
        }
       static boolean isEven(long a){
            return (a&1)==0;
        }
       static  void swap (int a, int b){

        int temmp = b;
        b=a;
        a = temmp;
        }
        static boolean same(int [] arr,int [] temp){
            Arrays.sort(arr);
           Arrays.sort(temp);
            for(int i=0;i<arr.length;i++){
                if(temp[i]!=arr[i])
                return false;
            }
            return true;
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