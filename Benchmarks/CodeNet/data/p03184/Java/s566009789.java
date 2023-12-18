import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	static int mod =(int)1e9+7;
	static int nax = (int) 2e5+5;
    static  long[]fac ;
	static long[]inv_fac;
  public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	fac = new long[nax];
	inv_fac = new long[nax];
	fac[0] = 1;
	inv_fac[0] =1;
    for(int i = 1; i < nax; ++i) {
        fac[i] = mul(fac[i-1], i);
        inv_fac[i] = my_inv(fac[i]);
    }
	int n = scn.nextInt();
	int m = scn.nextInt();
	int k = scn.nextInt();
	ArrayList<int[]>block = new ArrayList<>();
	for(int i=0;i<k;i++)
	{
		int[]pos = new int[2];
		pos[0] = scn.nextInt();
		pos[1] = scn.nextInt();
		block.add(pos);
	}
	Collections.sort(block, new Comparator<int[]>() {
		public int compare(int[]a,int[]b)
		{
			return (a[0]+a[1])-(b[0]+b[1]);
		}
	});
	block.add(new int[] {n,m});
	long[]dp = new long[k+1];
	for(int i=0;i<=k;i++)
	{
		long temp= f(block.get(i)[0]-1,block.get(i)[1]-1);
		for(int j=0;j<i;j++)
		{
			if(block.get(j)[0]<=block.get(i)[0]&&block.get(j)[1]<=block.get(i)[1])
			{
				temp=sub(temp,mul(dp[j],f(block.get(i)[0]-block.get(j)[0],block.get(i)[1]-block.get(j)[1])));
			}
			
		}
		dp[i]=temp;
	}
	
	System.out.println(dp[k]);
}
  public static long mul(long fac2,long a)
  {
	  return (long)fac2*a%mod ;
  }
  public static  long binomial(int a,int b)
  {
	  if(a < 0 || b < 0 || b > a) {
	        return 0;
	    }
	  return mul(fac[a],mul(inv_fac[b],inv_fac[a-b]));
  }
  public static long my_inv(long fac2)
  {
	  return my_pow(fac2, mod - 2);
  }
  public static long my_pow(long a, long b) {
	    long res = 1;
	    while(b>0) {
	        if(b % 2==1) {
	            res = mul(res, a);
	        }
	        a = mul(a, a);
	        b /= 2;
	    }
	    return res;
	}
  public static long f(int a,int b)
  {
	  return binomial(a+b,b);
  }
  public static long sub(long temp, long l) {
	    return (temp - l + mod) % mod;
	}
}
