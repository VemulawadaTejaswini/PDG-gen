import java.util.Scanner;

public class Main {


	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a = scan.nextInt();
		int b = scan.nextInt();
		int ans = n / (a + b) * a;
		int rem = n % (a + b);
		ans += (rem > a ? a : rem);
		System.out.println(ans);

	}

}
