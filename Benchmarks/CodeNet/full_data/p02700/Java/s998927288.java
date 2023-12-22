import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int ta = sc.nextInt();
		int tb = sc.nextInt();
		
		int ac = sc.nextInt();
		int ad = sc.nextInt();
		
		int t = ta+tb;
		int a = ac+ad;
		
		if(t>= a)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
		
		sc.close();
		
		

	}

}
