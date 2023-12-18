import java.util.Scanner;

public class Main {
	

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int a,b,c;
		a=cin.nextInt();
		b=cin.nextInt();
		c=cin.nextInt();
		if((c-a-b)<0)
		{
			System.out.println("No");
		}
		else {
			if((c-a-b)*(c-a-b)>4*a*b)
			{
				System.out.println("Yes");
			}
			else
			{
				System.out.println("No");
			}
		}
		cin.close();
	}

}
