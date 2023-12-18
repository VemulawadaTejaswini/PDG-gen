import java.util.Scanner;

public class main {
	public static void main(String[] abs) {
		Scanner x = new Scanner(System.in);
		
		int a = x.nextInt();
		int b = x.nextInt();
		
		if(b%a==0)
		{
			System.out.println(+(a+b));
		}
		
		else
			System.out.println(+(b-a));
	}
}
