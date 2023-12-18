import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力

		int n = sc.nextInt();
		List<Long> list = new ArrayList<>();

		for (int i = 0; i < n-1; i++) {
			long b = sc.nextLong();
			list.add(b);
		}

		long result = 0;
		
		result += list.get(0);
		for (int i = 1; i < n-1; i++) {
			long left = list.get(i-1);
			long right = list.get(i);
			long a = Math.min(left, right);
			result += a;
		}
		result += list.get(n-2);


		System.out.println(result);

	}
}
