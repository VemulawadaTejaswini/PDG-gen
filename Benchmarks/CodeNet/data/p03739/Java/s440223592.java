import java.util.*;

public class Main {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		long sum = sc.nextLong();
		long ret = 0;
		long tmp = 0;
		for (int i = 1;i < n;i++) {
			long a = sc.nextInt();
			tmp = sum;
			sum += a;
			if (tmp*sum<0) continue;
			long l = Math.abs(sum)+1;
			if (sum>=0) {
				sum -= l;
			} else {
				sum += l;
			}
			ret += l;
		}
		System.out.println(ret);
	}
}
