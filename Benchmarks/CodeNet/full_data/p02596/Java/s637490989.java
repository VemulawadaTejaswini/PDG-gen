import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		// System.out.println("k: " + k);
		int ans = -1;
		int i = 1;
		int cur = 7;
		while (i <= k) {
			cur = (cur * 10 + 7) % k;
			i++;
			if (cur == 0) {
				ans = i;
				break;
			}
		}
		System.out.println(ans);
	}
}






