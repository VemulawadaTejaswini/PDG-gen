import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a,b,sum=0;
		a = sc.nextInt();
		b = sc.nextInt();
		
		
		if((a+b)%3==0)
			System.out.println("Possible");
		else
			System.out.println("Impossible");
	}
}