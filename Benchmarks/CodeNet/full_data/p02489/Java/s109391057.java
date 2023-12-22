import java.util.Scanner;


public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n=1, dst;
		
		while(true)
		{
			dst = sc.nextInt();
			if(dst == 0)break;
			
			System.out.println("Case "+n+": "+dst);
			n++;
		}
	}
}