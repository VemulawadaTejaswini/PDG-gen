import java.util.*;
class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		boolean m = false;
		
		for(int i = A; i <= B; i++)
		{
			 if(i%n == 0)
			 {
			 	m = true;
			 }
		}
		
		if(m = true)
		{
			System.out.println("OK");
		}
		else
		{
			System.out.println("NG");
		}
	}
}