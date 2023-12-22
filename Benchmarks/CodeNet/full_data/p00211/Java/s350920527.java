import java.math.*;
import java.util.*;
public class a0211{
	public static void main(String[] args){
		int i;
		Scanner sc=new Scanner(System.in);
		int n;
		while(true){
			n=sc.nextInt();
			if(n==0)
				break;
			int[] a=new int[n];
			int[] b=new int[n];
			for(i=0;i<n;++i){
				a[i]=sc.nextInt();
				b[i]=sc.nextInt();
			}
			BigInteger c=new BigInteger(Integer.toString(b[0]));
			for(i=1;i<n;++i)
				c=c.divide(c.gcd(new BigInteger(Integer.toString(b[i])))).multiply(new BigInteger(Integer.toString(b[i])));
			BigInteger[] d=new BigInteger[n];
			for(i=0;i<n;++i)
				d[i]=c.divide(new BigInteger(Integer.toString(b[i]))).multiply(new BigInteger(Integer.toString(a[i])));
			BigInteger e=new BigInteger("1");
			for(i=0;i<n;++i)
				e=e.divide(e.gcd(d[i])).multiply(d[i]);
			for(i=0;i<n;++i){
				System.out.println(new BigInteger(Integer.toString(b[i])).multiply(e).divide(new BigInteger(Integer.toString(a[i]))).divide(c));
			}
		}
	}


}