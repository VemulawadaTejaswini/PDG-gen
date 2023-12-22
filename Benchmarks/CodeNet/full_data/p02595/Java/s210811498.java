import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		double d=s.nextDouble();
		
		int count=0;
		
		for(int i=0;i<n;i++)
		{
			double x=s.nextDouble();
			double y=s.nextDouble();
			
			double dist=Math.sqrt((x*x)+(y*y));
			
			if(dist<=d)
			{
				count++;
			}
			
		}
		
		System.out.println(count);
		
	}
	
}