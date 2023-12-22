
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main
{
    public static void print(String str,int val){
        System.out.println(str+"  "+val);
    }

    public long gcd(long a, long b) {
        if (b==0L) return a;
        return gcd(b,a%b);
    }

    public static void debug(long[][] arr){
        int len = arr.length;
        for(int i=0;i<len;i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }
    public static void debug(int[][] arr){
        int len = arr.length;
        for(int i=0;i<len;i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }
    public static void debug(String[] arr){
        int len = arr.length;
        for(int i=0;i<len;i++){
            System.out.println(arr[i]);
        }
    }

    public static void print(int[] arr){
        int len = arr.length;
        for(int i=0;i<len;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print('\n');
    }
    public static void print(String[] arr){
        int len = arr.length;
        for(int i=0;i<len;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print('\n');
    }
    public static void print(long[] arr){
        int len = arr.length;
        for(int i=0;i<len;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print('\n');
    }

    static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }
        public FastReader(String path) throws FileNotFoundException {
            br = new BufferedReader(new FileReader(path));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException  e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt()
        {
            return Integer.parseInt(next());
        }

        long nextLong()
        {
            return Long.parseLong(next());
        }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
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


    public static void main(String[] args)
    {
        FastReader s=new FastReader();
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        int start =0;
        int money = 1000;
        int max = 1000;
        int n_stocks =0;
        while (true){

            if(start>=n-1){
                break;
            }
            //find local min
            for(;start<n-1;start++){
                if(start==0){
                    if(arr[start]<arr[start+1]){
                        n_stocks = (money/arr[start]);
                        money -= n_stocks*arr[start];
                        start++;
                        break;
                    }
                }
                else if(arr[start]<=arr[start-1] && arr[start]<arr[start+1]){
                    n_stocks = (money/arr[start]);
                    money -= n_stocks*arr[start];
                    start++;
                    break;
                }
            }
            //find local_max
            for(;start<=n-1;start++){
                if(start==n-1){
                    if(arr[start]>arr[start-1]){
                        money+=arr[start]*n_stocks;
                        n_stocks =0;
                        start++;
                        break;
                    }
                }
                else if(arr[start]>=arr[start-1] && arr[start]>arr[start+1]){
                    money+=arr[start]*n_stocks;
                    n_stocks=0;
                    start++;
                    break;
                }
            }
            max = Math.max(max,money);
        }
        System.out.println(max);

    }




//    OutputStream out = new BufferedOutputStream( System.out );
//        for(int i=1;i<n;i++){
//              out.write((arr[i]+" ").getBytes());
//         }
//        out.flush();
//  long start_time = System.currentTimeMillis();
//  long end_time = System.currentTimeMillis();
//  System.out.println((end_time - start_time) + "ms");



}
