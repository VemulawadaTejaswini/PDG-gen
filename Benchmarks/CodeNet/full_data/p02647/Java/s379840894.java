
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class LampsC
{
    public static void print(String str,int val){
        System.out.println(str+"  "+val);
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


    public static void main(String[] args) throws IOException {
        FastReader s=new FastReader();
        int n = s.nextInt();
        int k = s.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        while ((k--)>0){
            int[] diff = new  int[n];
            for(int i=0;i<n;i++){
                int min = i-arr[i];
                int max = i+arr[i]+1;
                if(min>=0 && max<n){
                    diff[min]++;
                    diff[max]--;
                }
                else if(min<0 && max>=n){
                    diff[0]++;
                }
                else if(min<0){
                    diff[0]++;
                    diff[max]--;
                }
                else {
                    diff[min]++;
                }

            }
            arr[0] = diff[0];
            for(int i=1;i<n;i++){
                arr[i] = diff[i]+arr[i-1];
            }
            //check if all n's
            boolean isTrue = true;
            for(int i=0;i<n;i++){
                if(arr[i]!=n){
                    isTrue =false;
                    break;
                }
            }
            if(isTrue){
                break;
            }
        }
        OutputStream out = new BufferedOutputStream( System.out );
        for(int i=0;i<n;i++){
            out.write((arr[i]+" ").getBytes());
        }
        out.flush();

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
