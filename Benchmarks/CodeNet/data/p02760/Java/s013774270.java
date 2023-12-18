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
    static boolean [][] grid;
    static int [] bishopr = {-1,1,-1,1};
    static int [] bishopc = {1,1,-1,-1};
    static long H,W,cnt;
    public static void main(String args[]) throws IOException {
            int [][] grid  = new int[3][3];
            for(int i=0;i<3;i++)
                for(int j=0;j<3;j++)
                grid[i][j]= in.nextInt();
            int N =in.nextInt();
            for(int k=0;k<N;k++){
                int  p = in.nextInt();
                for(int i=0;i<3;i++)
                for(int j=0;j<3;j++)
                if(grid[i][j] ==p)
                grid[i][j] =  -1;
            }
            boolean yes = false;
            //stop
            for(int i=0;i<3;i++){
                int count =0;
                for(int j=0;j<3;j++){
                    if(grid[i][j]==-1)
                    count++;
                }
                if(count==3)
                yes = true;
            }
            for(int i=0;i<3;i++){
                int count =0;
                for(int j=0;j<3;j++){
                    if(grid[j][i]==-1)
                    count++;
                }
                if(count==3)
                yes = true;
            }
            if((grid[0][0]==grid[1][1])&&grid[1][1]==grid[2][2]){
                yes = true;
            }
            if((grid[0][2]==grid[1][1])&&(grid[1][1]==grid[2][0])){
                yes = true;
            }
            out.println(yes?"Yes":"No");
        out.flush();
        }   

        static boolean isEven(long a) {
            return (a&1)==0;
        }
       static  void swap (int a, int b){

        int temmp = b;
        b=a;
        a = temmp;
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