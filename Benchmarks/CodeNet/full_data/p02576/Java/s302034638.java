import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int x = scan.nextInt();
		int t = scan.nextInt();
		int ans = 0;

		while(n >= x) {
			n -= x;
			ans++;
		}
		System.out.println(ans*t);

	}

}