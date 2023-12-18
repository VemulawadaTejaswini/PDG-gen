import java.io.*;
import java.math.*;
import java.util.*;





public class Main {

    static MyScanner in = new MyScanner();
    static   PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
    int N;
    static int max = 100000;
    static int [] dr = {1,-1,0,0};
    static int [] dc={0,0,-1,1};
    static int [] Ft = new int  [max+1];
    public static void main(String args[]) throws IOException {
        int N = in.nextInt();
        for(int i=0;i<N;i++){
            update(in.nextInt());
        }
        int K = 0;
        for(int i=1;i<=max+1;i++){
            int ABC = prefix(i-1);
            int ARC = N-ABC;
            if(ABC==ARC)
                K++;
        }
        out.println(K);
        out.flush();
        }
        static int lsb(int i){return i&-i;};
        static int prefix(int idx){
            int sum=0;
            while(idx>0){
                sum+=Ft[idx];
                idx-=lsb(idx);
            }
            return sum; 
        }
        static void update(int idx){
            while(idx<=max){
                Ft[idx]+=1;
                idx+=lsb(idx);
            }
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