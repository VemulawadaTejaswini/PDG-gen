
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main
{
    public static void print(String str,int val){
        System.out.println(str+"  "+val);
    }

    public int gcd(int a, int b) {
        if (b==0) return a;
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
        int[] count = new int[100001];
        long sum =0;
        for(int i=0;i<n;i++){
            int next = s.nextInt();
            sum+=next*1L;
            count[next]++;
        }
        int q = s.nextInt();
        while ((q--)>0){
            int bi = s.nextInt();
            int ci = s.nextInt();
            int cnt = count[bi];
            count[bi] =0;
            count[ci]+=cnt;
            sum+=(cnt)*(ci-bi)*1L;
            System.out.println(sum);
        }

    }




//    OutputStream out = new BufferedOutputStream( System.out );
//        for(int i=1;i<n;i++){
//    out.write((arr[i]+" ").getBytes());
//}
//        out.flush();

    //  long start = System.currentTimeMillis();
//  long end = System.currentTimeMillis();
//  System.out.println((end - start) + "ms");



}
