import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long d = sc.nextLong();
//		String[] array = new String[n];
//		for(int i=0;i<n;i++) {
//				array[i] = sc.next();
//		}
		sc.close();

		long ans = -1000000000000000000L;

		ans = Math.max(ans, a*c);
		ans = Math.max(ans, a*d);
		ans = Math.max(ans, b*c);
		ans = Math.max(ans, b*d);

		System.out.println(ans);
	}
}
