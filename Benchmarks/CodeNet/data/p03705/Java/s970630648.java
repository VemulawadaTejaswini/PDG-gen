import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println(ans(n,a,b));
		sc.close();
	}
	
	public static int ans(int n, int a, int b) {
		if (a > b) {
			return 0;
		}
		if (n == 1) {
			if (a == b) {
				return 1;
			}
			return 0;
		}
		return (b-a) * (n-2) + 1;
	}
}
