
import java.util.*;
public class atcoderA {
	void cal()
	
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		
		if(n==m)
		{

			System.out.println(" Yes ");
		
	}
		else
		{
			System.out.println(" No ");
		}
		sc.close();
	}
	
	public static void main(String args[])
	{
		atcoderA obj=new atcoderA();
				obj.cal();


	}
	
}

