import java.io.*;
import java.lang.*;
import java.util.*;
public class Main{
    public static long sumGCD(long[] arr){
        long max=0;
        for(int i=0;i<arr.length;i++)
            if(arr[i]>max) max=arr[i];
        long[] c=new long[(int)max+1];
        long[] d=new long[(int)max+1];
        long[] e=new long[(int)max+1];
        for(int i=0;i<arr.length;i++) c[(int)arr[i]]++;
        for(int i=1;i<=max;i++){
            for(int j=i;j<=max;j+=i) d[i]+=c[j];
        }
        for(int i=(int)max;i>=1;i--){
            e[i] = d[i]*d[i]*d[i];
            for(int j=2*i;j<=max;j+=i) e[i] -= e[j];
        }
        long sum=0;
        for(int i=1;i<=max;i++) sum+=(i*e[i]);
        return sum;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        long[] arr=new long[n];
        for(int i=1;i<=n;i++) arr[i-1]=i;
        long ans=sumGCD(arr);
        System.out.println(ans);
    }
}