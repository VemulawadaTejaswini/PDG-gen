import java.io.*;
import java.lang.*;
import java.util.*;
public class Main{
    public static long pow(long a,long b,long m){
        if(a==0 || a==1) return a;
        if(b==1) return a%m;
        long c=pow(a,b/2,m);
        if(b%2==0) return (c*c)%m;
        else return (((c*c)%m*(a%m))%m);
    }
    public static long sumGCD(long[] arr ,long n,long m){
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
            e[i] = pow(d[i],n,m);
            for(int j=2*i;j<=max;j+=i){
                e[i] -= e[j];
                if(e[i]<=0) e[i]+=m;
            }
        }
        long sum=0;
        for(int i=1;i<=max;i++) sum=(sum+i*e[i])%m;
        return sum;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] str=br.readLine().split(" ");
        long n=Long.parseLong(str[0]);
        long k=Long.parseLong(str[1]);
        long[] arr=new long[(int)k];
        for(int i=1;i<=k;i++) arr[i-1]=i;
        long ans=sumGCD(arr,n,1000000007);
        System.out.println(ans);
    }
}