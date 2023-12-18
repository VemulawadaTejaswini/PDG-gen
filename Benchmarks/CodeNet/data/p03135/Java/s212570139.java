import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		int X = sc.nextInt();
		double ans = 0;
		ans = T / X;
		String ans1 = String.format( "%.10f",ans );
		System.out.println( ans1 );
	}
}