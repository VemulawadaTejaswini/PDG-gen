
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		int see = 2 * d + 1;
		int ans = n / see;
		if(n % see != 0)
			ans++;
		System.out.println(ans);
	}

}
