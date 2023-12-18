import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		int temp = 0;
		int x = 0;
		int sum = 0;
		
		for(int i = 0; i < sc.nextInt(); i++)
		{
			x = sc.nextInt();
			if(x > temp)
			{
				temp = x; 
			} else {
				sum = sum + x;
			}
		}
		
		if(x > sum)
		{
			System.out.println("Yes");
		} else 
		{
			System.out.println("No");
		}
		
	}

}
