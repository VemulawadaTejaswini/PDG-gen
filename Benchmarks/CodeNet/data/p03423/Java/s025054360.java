import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n;
		Scanner scanner = new Scanner(System.in);
		// 1 <= n <= 100, 整数
		n = scanner.nextInt();
		int ans;
		ans  = n / 3;
		
		System.out.println(ans);
		
		scanner.close();
	}

}
