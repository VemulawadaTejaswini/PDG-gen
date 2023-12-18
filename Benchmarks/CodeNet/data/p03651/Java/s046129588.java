import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
public class harshg_11740370_2{
    static class FastReader{
        BufferedReader br;
        StringTokenizer st;
        public FastReader(){
            br = new BufferedReader(new
                     InputStreamReader(System.in));
        }
        String next(){
            while (st == null || !st.hasMoreElements()){
                try{
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException  e){
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt(){
            return Integer.parseInt(next());
        }
        long nextLong(){
            return Long.parseLong(next());
        }
        double nextDouble(){
            return Double.parseDouble(next());
        }
        String nextLine(){
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }
    public static void main(String[] args){
        FastReader s=new FastReader();
        int t=1;
        outer:
        while(t--!=0){
            int n=s.nextInt();
            int k=s.nextInt();
            int arr[]=new int[n];
            int nice=0;
    //        System.out.println(gcd(2,4));
            arr[0]=s.nextInt();
            int max=arr[0];
            for(int i=1;i<n;i++){
                arr[i]=s.nextInt();
                if(arr[i]>max)
                    max=arr[i];
            }
            if(k>max||k<1){
                System.out.println("IMPOSSIBLE");
                continue;
            }
            if(n==1){
                if(k%arr[0]==0){
                    System.out.println("POSSIBLE");
                    continue;
                }
                else{
                    System.out.println("IMPOSSIBLE");
                    continue;
                }
            }       
            int l=arr[0];
            for(int i=0;i<n-1;i++){
                nice=l<arr[i+1]?gcd(l,arr[i+1]):gcd(arr[i+1],l);
                l=nice;
                if(nice==1){
                    System.out.println("POSSIBLE");
                    continue outer;
                }
            }
    //        System.out.println(nice);
    //        System.out.println(max);
            if(k%nice==0){
                System.out.println("POSSIBLE");
            }
            else{
                System.out.println("IMPOSSIBLE");   
            }
        }
    }
    static int gcd(int a,int b){
        if(b%a==0){
            return a;
        }
        else{
            return gcd(b%a,a);
        }
    }
}