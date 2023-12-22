import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		long a=s.nextLong();
		long b=s.nextLong();
		
		long c=s.nextLong();
		long d=s.nextLong();
		
		long max=Long.MIN_VALUE;
		
		if(a*c>max)
			max=a*c;
		if(a*d>max)
			max=a*d;
		if(b*c>max)
			max=b*c;
		if(b*d>max)
			max=b*d;
		
		System.out.println(max);
		
	}
	
}