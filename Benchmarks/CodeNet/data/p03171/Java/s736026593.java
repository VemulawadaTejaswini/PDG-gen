import java.io.*;
import java.math.*;
import java.util.*;





public class Main {

    static MyScanner in = new MyScanner();
    static   PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
    int N;
    static int max = 200001;
    static int [] dr = {1,-1,0,0};
    static int [] dc={0,0,-1,1};
    static class Edge{
        int u,w;
        Edge(int u, int w){
            this.u =u;this.w = w;
        }
    }
    public static void main(String args[]) throws IOException {
        int N = in.nextInt();
        int [] arr = new int[N+1];
        for(int i=1;i<=N;i++){
            arr[i] = in.nextInt();
        }
        int [][] dp = new int[N+1][N+1];
        for(int L=N;L>0;L--){
            for(int R = L;R<=N;R++){
                if(L==R){
                    dp[L][R] = arr[L];
                }else{
                    int leftChoice = arr[L]-dp[L+1][R];
                    int rightChoice = arr[R]-dp[L][R-1];
                    dp[L][R] = Math.max(leftChoice,rightChoice);
                }
            }
        }
        out.println(dp[1][N]);
        out.flush();
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