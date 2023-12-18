import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int hp1 = sc.nextInt();
		int s1 = sc.nextInt();
		int hp2 = sc.nextInt();
		int s2 = sc.nextInt();
		
		//taka
		while(true)
		{
			hp2 -= s1;
			
			if(hp2 <= 0)
			{
				System.out.println("Yes");
				return;
			}
			
			hp1 -= s2;
			if(hp1 <= 0)
			{
				System.out.println("No");
				return;
			}
		}
		
	}

}
