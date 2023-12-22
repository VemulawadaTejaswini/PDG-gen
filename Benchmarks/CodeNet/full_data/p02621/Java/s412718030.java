import java.util.Scanner;


public class Main {
	public static void main (String args[]) throws Exception{
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int ans = a + a * a + a * a * a;
		System.out.print(a);
	}
}