import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int x,a,b;
		x = sc.nextInt();
		a = sc.nextInt();
		b = sc.nextInt();
		
		if(a>b)
			System.out.println("delicious");
		else if((b-a)>x)
			System.out.println("dangerous");
		else
			System.out.println("safe");
		
	}
}