import java.io.*;
import java.util.*;

public class Main{
    static class FastReader{
        BufferedReader br;
        StringTokenizer st;
        public FastReader(){br = new BufferedReader(new InputStreamReader(System.in));}
        String next(){while (st == null || !st.hasMoreElements()){try{st = new StringTokenizer(br.readLine());}catch (IOException  e){e.printStackTrace();}}return st.nextToken();}
        int nextInt(){return Integer.parseInt(next());}
        long nextLong(){return Long.parseLong(next());}
        double nextDouble(){return Double.parseDouble(next());}
        int[] readArray(int n){int[] a=new int[n];for (int i=0; i<n; i++) a[i]=nextInt();return a;}
        long[] readLongArray(int n){long[] a=new long[n];for (int i=0; i<n; i++) a[i]=nextLong();return a;}
        String nextLine(){String str = "";try{str = br.readLine();}catch (IOException e){e.printStackTrace();}return str;}
    }
    static int getgcd(int n1,int n2){
        while(n1 != n2){
            if(n1 > n2) n1 -= n2;
            else n2 -= n1;
        }
        return n1;
    }
    static boolean isSorted(int[] arr, int n){
        for(int i=1;i<n;i++){
            if(arr[i]<arr[i-1]) return false;
        }
        return true;
    }
    static boolean isPrime(long n){
        if(n==2) return true;
        else if(n%2==0) return false;
        for(int i=3;i<=n/2;i+=2){
            if(n%i==0) return false;
        }
        return true;
    }
    static void printArray(int[] arr){
        for(int x:arr){
            System.out.print(x+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) throws NumberFormatException, IOException {
        FastReader s=new FastReader();
        int n=s.nextInt();
        int m = 1000,count=0;
        int[] a = s.readArray(n);
        for(int i=0;i<(n-1);i++){
            if(a[i+1]>a[i]) {
                count=(m/a[i]);
                m=(m%a[i]);
                while(i<(n-1) && a[i+1]>a[i]) i++;
                m+=(count*a[i]);
            }
        }
        System.out.println(m);
    }
}