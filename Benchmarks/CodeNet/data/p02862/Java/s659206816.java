
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class Main{
	static BufferedReader br;
	static int cin() throws Exception
	{
		return Integer.valueOf(br.readLine());
	}
	static int[] split() throws Exception
	{
		String[] cmd=br.readLine().split(" ");
		int[] ans=new int[cmd.length];
		for(int i=0;i<cmd.length;i++)
		{
			ans[i]=Integer.valueOf(cmd[i]);
		}                                              
		return ans;
	} 
	static long mod=1000000007;
	static long power(long x,long y) 
    { 
        long res = 1; 
        x = x % mod; 
        while (y > 0) { 
            if (y % 2 == 1) 
                res = (res * x) % mod; 
            y = y >> 1;
            x = (x * x) % mod; 
        } 
        return res%mod; 
    } 
    static long modInverse(long n) 
    { 
        return power(n, mod-2); 
    } 
    public static void main(String[] args) throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        int[]ar=split();
        int n=ar[0];
        int m=ar[1];
        int x=2*n-m;
        int y=2*m-n;
        if(x<0 || y<0 || x%3!=0 || y%3!=0)
        	System.out.println(0);
        else
        {
        	x=x/3;
        	y=y/3;
        	long res=1;
        	long[]fac=new long[x+y+1];
        	for(int i=1;i<=(x+y);i++)
        	{
        		res=(res*(long)i)%mod;
        		fac[i]=res;
        	}
        	long result=(((fac[x+y]*modInverse(fac[x]))%mod)*modInverse(fac[y]))%mod;
        	System.out.println(result);
        }
    }
}