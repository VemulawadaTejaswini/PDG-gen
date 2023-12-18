// Working program with FastReader
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Inet4Address;
import java.util.*;

public class Main
{
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

    //        long start = System.currentTimeMillis();
//        long end = System.currentTimeMillis();
//        System.out.println((end - start) + "ms");
    static  ArrayList<Integer>[] adjList;
    static long[][] dp;
    public static void main(String[] args)
    {
        FastReader s=new FastReader();
//        int t = s.nextInt();
//        for(int tt=0;tt<t;tt++){
            int n = s.nextInt();
            ArrayList<Integer>[] al = new ArrayList[n];
            for(int i=0;i<n;i++){
                al[i] = new ArrayList<Integer>();
            }
            for(int i=0;i<n-1;i++){
                int a = s.nextInt();
                int b = s.nextInt();
                al[a-1].add(b-1);
                al[b-1].add(a-1);
            }
            adjList = al.clone();
            dp = new long[n][2];
            for(long[] a : dp){
                Arrays.fill(a,-1l);
            }
            if(n==1){
                System.out.println(2);
                return;
            }
            else {
                System.out.println(n_ways(-1,0,0)+n_ways(-1,0,1));
            }

    }

    public static long n_ways(int parent,int vertex,int color){
        if(dp[vertex][color]!=-1l){
            return dp[vertex][color];
        }
        dp[vertex][color]=1;
        for(int child:adjList[vertex]){
            if(child==parent){
                continue;
            }
            else {
                if(color==0){
                    dp[vertex][color]*=(n_ways(vertex,child,0)+n_ways(vertex,child,1));
                }
                else {
                    dp[vertex][color]*=(n_ways(vertex,child,0));
                }
            }
        }
        return dp[vertex][color];
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
    public static void print(ArrayList<Integer>[] arr){
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






}
