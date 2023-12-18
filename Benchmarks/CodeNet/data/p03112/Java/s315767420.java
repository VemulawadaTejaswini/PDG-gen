

import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
//		int n=scan.nextInt();
		int a=scan.nextInt();
		int b=scan.nextInt();
		int q=scan.nextInt();
		TreeSet<Long> shrines=new TreeSet<Long>();
		TreeSet<Long> temples=new TreeSet<Long>();
		for(int i=0;i<a;i++)
		{
			shrines.add(scan.nextLong());
		}
		for(int i=0;i<b;i++)
		{
			temples.add(scan.nextLong());
		}
		for(int i=0;i<q;i++)
		{
			long x=scan.nextLong();
			Long LS=shrines.floor(x);
			long distLS=(LS==null)?(1L<<60):x-LS;
			Long RS=shrines.ceiling(x);
			long distRS=(RS==null)?(1L<<60):RS-x;
			Long LT=temples.floor(x);
			Long RT=temples.ceiling(x);
			long distlt=(LT==null)?(1l<<60):x-LT;
			long distrt=(RT==null)?(1L<<60):RT-x;
//			System.out.println();
//			System.out.println(distRS+" "+distLS+" "+distlt+" "+distrt);
			
			long A=(Math.max(distrt, distRS));
			long B=2*distRS+distlt;
			long D=2*distrt+distLS;
			long E=2*distLS+distrt;
			
			long F=2*distlt+distRS;
			long c=Math.max(distLS,distlt);
			long gg=Math.min(Math.min(A, B),c);
			
			long ans=Math.min(gg, D);
			
			ans=Math.min(ans, E);
			ans=Math.min(ans, F);
//			long ans=Math.min(gg, D);
			System.out.println(ans);
		}
		
				
	}
}
