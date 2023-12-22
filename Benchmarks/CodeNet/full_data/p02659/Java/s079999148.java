import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		double a=s.nextDouble();
		double b=s.nextDouble();
		
		double ans=a*b;
		
		System.out.println((long)Math.floor(ans));
		
	}
	
}