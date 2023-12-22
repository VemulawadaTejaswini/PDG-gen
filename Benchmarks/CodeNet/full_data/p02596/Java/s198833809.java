
import java.util.*;

public class Main {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n<7) System.out.println("-1");
		else
		{
			long seven=7;
			int dig=(int)Math.log10(n)+1;
			int digc=dig;
			while(dig>1)
			{
				dig--;
				seven+=Math.pow(10, dig)*7;	
			}
			//System.out.println(seven);
			long count=digc;
			while(seven%n!=0)
			{
				count++;
				
				seven+=Math.pow(10, digc)*7;
				digc++;
			//	System.out.println(seven);
				
//				try
//				{
//				    Thread.sleep(1000);
//				}
//				catch(InterruptedException ex)
//				{
//				    Thread.currentThread().interrupt();
//				}
			}
			System.out.println(count);
		}
}
}
