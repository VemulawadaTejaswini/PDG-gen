import java.util.Scanner;
import java.math.BigInteger;
public class Main
{
	public static void main(String args[])throws Exception
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a[]=new int[n];
		for( int i=0;i<n;i++)
		a[i]=in.nextInt();
		BigInteger kk,ppl,llp;
		BigInteger p=new BigInteger("0");
		for(int i=0;i<n;i++)
		{
			int k=a[i];
			 kk=BigInteger.valueOf(k);
			for(int j=i+1;j<n;j++)
			{   
			   int pl=a[j];
			   //	 ppl=pl;
				ppl=BigInteger.valueOf(pl);
				llp=kk.multiply(ppl);
				p=p.add(llp);
			}
		}
		BigInteger nm=new BigInteger("1000000007");
		p=p.mod(nm);
		System.out.println(p);
	}
}