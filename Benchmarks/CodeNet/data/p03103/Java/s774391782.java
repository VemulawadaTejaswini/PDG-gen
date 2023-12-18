import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		Obj[] arr = new Obj[n];
		for (int i = 0; i < n; i++) {
			Obj o = new Obj();
			o.a = sc.nextInt();
			o.b = sc.nextInt();
			arr[i] = o;
		}
		sc.close();

		Arrays.sort(arr, (o1, o2) -> o1.a - o2.a);
		int sum = 0;
		long ans = 0;
		for (Obj o : arr) {
			if (sum + o.b >= m) {
				ans += (long) o.a * (m - sum);
				break;
			} else {
				ans += (long) o.a * o.b;
				sum += o.b;
			}
		}
		System.out.println(ans);
	}

	static class Obj {
		int a, b;
	}
}
