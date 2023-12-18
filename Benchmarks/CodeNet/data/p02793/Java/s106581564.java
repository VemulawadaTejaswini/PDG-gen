import java.util.*;

public class Main {
    static int mod=(int)1e9+7;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        long[] a=new long[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextLong();
        }
        long min=1;
        long sum=0;
        for(int i=0;i<n;i++)
        {
            min=lcm(min, a[i]);
        }
        for(int i=0;i<n;i++){
            sum+=min/a[i];
            sum=sum%mod;
        }
        System.out.println(sum);
    }
    static long gcd(long a, long b)
    {
        if(b==0)return a;
        return gcd(b,a%b);
    }
    static long lcm(long a, long b)
    {
        return a*b/gcd(a,b);
    }
}