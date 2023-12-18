import java.io.*; 
import java.math.*;
import java.math.BigInteger;
import java.util.Scanner;
import java.lang.Math;
import java.math.BigDecimal;
import java.math.*; 
import java.util.Arrays;
import java.util.HashMap; 
import java.util.Map;
import com.google.common.math.BigIntegerMath;

class myfib{
	// 	static int[] f=new int[100];
	// public static void ncr(int n,int r) 
	// 	{ 
	// 		BigInteger up=factorial(n);
	// 		BigInteger d1=factorial(n-r);
	// 		BigInteger d2=factorial(r);
	// 		BigInteger fans=up.divide(d1);
	// 		fans=fans.divide(d2);
	// 		System.out.println(fans);
	// 	}

	// public static BigInteger factorial(int n) {
 //       BigInteger fact = new BigInteger("1");
 //       for (int i = 1; i <= n; i++) {
 //           fact = fact.multiply(new BigInteger(i + ""));
 //       }
 //       return fact;
 //   }
	public static void main(String[] args){
		Scanner input= new Scanner(System.in);
		int n= input.nextInt();
		//int i=0;
		int[] arr=new int[n];
		BigInteger sum=new BigInteger("0");
		for(int j=0;j<n;j++)
		{
			arr[j]=input.nextInt();
			sum=sum.add(new BigInteger(arr[j]+""));
		}
		BigInteger sum2=new BigInteger("0");
		BigInteger ans=new BigInteger("20202020202000000");
		for(int i=0;i<n;i++)
		{
			sum2=sum2.add(new BigInteger(arr[i]+""));
			//BigInteger x=new BigInteger(sum-sum2+"");
			BigInteger x=sum.subtract(sum2);
			BigInteger sub=x.subtract(sum2);
			sub=sub.abs();
			ans=ans.min(sub);
		}
		System.out.println(ans);
		// while(i<t)
		// {
		// 	int  n=input.nextInt();
		// 	//BigInteger n=input.nextBigInteger();
		// 	int k=input.nextInt();
		// 	int[] arr=new int[n];
		// 	for(int j=0;j<n;j++){
		// 		arr[j]=input.nextInt();
		// 	}
		// 	Arrays.sort(arr);
		// 	int nb=arr[k-1],ct=0;
		// 	HashMap<Integer,Integer>mp=new HashMap<>();
		// 	int id=0;
	 //        for (Integer x : arr) { 
	 //            Integer j = mp.get(x); 
	 //            mp.put(x, (j == null) ? 1 : j + 1); 
	 //            if(id++<k&&x==nb)
	 //            	ct++;
	 //        }
	 //        ncr(mp.get(nb),ct);
		// 	//n=fib(n);
		// 	// n=n%60;
		// 	// if(n==0)
		// 	// 	n=60;
		// 	//int p=(int)(Math.log((double)n)/Math.log((double)2));
		// 	//int p = BigIntegerMath.log2(n,RoundingMode.DOWN);
		// 	//n=(int)Math.pow(2,p);
		// 	//System.out.println(f[p]);
		// 	//System.out.println(n);
		// 	//fib(n-1);
		// 	//System.out.println(n%10);
		// 	//i++;
		// }
	}
}
