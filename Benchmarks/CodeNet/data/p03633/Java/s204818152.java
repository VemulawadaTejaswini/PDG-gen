import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int ans = 1;
		if (n == 1){
			ans = Integer.parseInt(sc.next());
		}else {
			for (int i=0; i<n; i++){
				ans = lcm(ans, Integer.parseInt(sc.next()));
			}
		}
		System.out.println(ans);
    }

	public static int gcd(int num1, int num2) {
		int x = Math.max(num1, num2);
		int y = Math.min(num1, num2);

		while (y != 0) {
			int tmp = x;
			x = y;
			y = tmp%y;
		}
		return x;
	}

	public static int  lcm(int num1, int num2) {
		return num1 * num2 / gcd(num1, num2);
    }
}