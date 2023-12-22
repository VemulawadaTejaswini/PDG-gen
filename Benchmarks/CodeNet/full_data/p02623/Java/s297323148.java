import java.util.*; 
import java.io.*;


// 
public class Main {
    static StringTokenizer st;
    static BufferedReader br;  
    static PrintWriter out;
 
    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        int N = nextInt();
        int M = nextInt();
        int K = nextInt();

        int[] N_List = new int[N+1];
        int[] M_List = new int[M+1];
       
        for(int i = 1; i<=N; i++){
            N_List[i] = nextInt();
        }
        for(int i = 1; i<=M; i++){
            M_List[i] = nextInt();
        }

        int N_Index = 1;
        int M_Index = 1;
       
        int ans = 0;
        int total = 0;
        int cur = 0;

        while(true){
            if(N_Index>N && M_Index > M ){
                System.out.println(ans);
                return;
            }
            if(N_Index>N){
                cur =M_List[M_Index];
                M_Index ++;
            }
            else if(M_Index>M){
                cur =N_List[N_Index];
                N_Index ++;
            }
            else if(N_List[N_Index]< M_List[M_Index] ){
                cur = N_List[N_Index];
                N_Index ++;
            }
            else{
                cur =M_List[M_Index];
                M_Index ++;
            }
            
            if(total+cur>K){
                System.out.println(ans);
                return;
            }
            total = total + cur;
            ans ++;
        }

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