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
    public static void main(String args[]) throws IOException {
        int N = in.nextInt();
        int [] a  = new int [N];
        int INF  = 100000000;
        int MINF = -10000000;
        int min = INF;
        int max = MINF;
        for(int i=0;i<N;i++)
        a[i] = in.nextInt();
        int A = 0;
        int B = 0;
        for(int i=0;i<N;i++){
            min = INF;
            max =MINF;
            int index = 0;
            if(i%2==0){
                for(int j=0;j<N;j++){
                    if(a[j]!=0){
                     if(a[j]>max){
                           max =a[j];
                            index = j;
                     }
                 }
                }
                A+=max;
                a[index] = 0;
            }else{
                for(int j=0;j<N;j++){
                    if(a[j]!=0){
                     if(a[j]>max){
                           max =a[j];
                            index = j;
                     }
                 }
                }
                B+=max;
                a[index] = 0;
            }


        }
        out.println(A-B);

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