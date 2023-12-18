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
            BitSet bs = new BitSet(N+1);
            int [] n = new int[N+1];
            for(int i=1;i<=N;i++)
            n[i] = in.nextInt();
            bs.set(1,true);
            int point =1;
            int count =0;
            while(!bs.get(2)&&count<100000){
                    count++;
                    bs.set(point, false);
                    point = n[point];
                    bs.set(point,true);
            }
           // System.out.println(point);
            System.out.println(count!=100000?count:-1);
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