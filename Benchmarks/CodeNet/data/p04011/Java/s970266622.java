import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int ans;
		ans=Math.min(k,n)*x+Math.max(0,n-k)*y;
		System.out.println(ans);
	}
}
