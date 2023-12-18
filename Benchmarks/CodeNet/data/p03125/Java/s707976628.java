import java.util.Scanner;
public class act118A {
	public static void main(String[] args)
	{
		int a,b;

		Scanner sc = new Scanner(System.in);

		a = sc.nextInt();

		b = sc.nextInt();


		if( b%a ==0)
			System.out.println(a+b);

		else
			System.out.println(b-a);

	}
}