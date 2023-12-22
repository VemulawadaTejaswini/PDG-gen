import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long ans = 1;
		long max = 1000000000000000000l;
		// System.out.println(max);
		List<Long> arr = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			arr.add(sc.nextLong());
		}
		Collections.sort(arr);
		for (int i = 0; i < n; i++) {
			if (arr.get(i) > max) {
				ans = -1;
				break;
			}
			ans *= arr.get(i);
			if (ans > max) {
				ans = -1;
				break;
			}
			if (ans == 0) {
				ans = 0;
				break;
			}
		}
		System.out.println(ans);
	}
}






