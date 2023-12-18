import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long sum = 0, ans = 1;
		for(int i = 0; i < n; i++) {
			sum += sc.nextInt();
		}
		int key = 0;
		for(int i = n - 1; i >= 1; i -= 2) {
			key += i;
		}
		key *= 2;
		if(sum == key) {
			for(int i = 0; i < n / 2; i++) ans *= 2;
		}
		else ans = 0;
		ans = ans % 1000000007;
		System.out.println(ans);
	}
}