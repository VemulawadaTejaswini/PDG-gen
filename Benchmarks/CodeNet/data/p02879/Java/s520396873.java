import java.util.Scanner;

public class A 
{
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int a  = sc.nextInt();
		int b  = sc.nextInt();
		
		if(a < 1 || a > 9)
		{
			System.out.println("-1");
		}
		
		if(b < 1 || b > 9)
		{
			System.out.println("-1");
		}
		
		System.out.println(a * b);
		

	}

}
