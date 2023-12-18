import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int ans = 0;
		int i;
		int length;
		for(i = 1; i <= n; i++) {
			length = String.valueOf(i).length();
			if(!(length % 2 == 0))
				ans++;
		}
		System.out.println(ans);
	}
}
