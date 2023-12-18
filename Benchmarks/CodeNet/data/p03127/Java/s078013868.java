//created by Whiplash99
import java.io.*;
import java.util.*;
public class Main
{
    private static long _gcd(long a, long b){return a==0?b:_gcd(b%a,a);}
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int i,N;

        N=Integer.parseInt(br.readLine().trim());
        String s[]=br.readLine().trim().split(" ");
        int a[]=new int[N];
        for(i=0;i<N;i++) a[i]=Integer.parseInt(s[i]);

        long ans=a[0];
        for(i=1;i<N;i++) ans=_gcd(ans,a[i]);
        System.out.println(ans);
    }
}