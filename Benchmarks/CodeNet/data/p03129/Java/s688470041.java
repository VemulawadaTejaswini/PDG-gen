import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(), k = sc.nextInt();
		
		String ans = "NO";
		
		if (n % 2 == 0) {
			if (n / 2 >= k) {
				ans = "YES";
			}
		} else if (n / 2 + 1 >= k) {
			ans = "YES";
		}
		
		System.out.println(ans);
		
		sc.close();
	}

}