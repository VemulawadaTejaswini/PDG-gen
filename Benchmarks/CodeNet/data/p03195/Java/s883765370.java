import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] a = new long[N];
		for(int i = 0; i < N; i++) {
			a[i] = sc.nextLong();
		}
		sc.close();
		int cnt = 0;
		long sum = 0;
		long max = 0;
		Arrays.sort(a);
//		if(a[0] == a[N - 1]) {
//			String ans ="";
//			if(a[0] == 1) {
//				ans = "first";
//			}else {
//				if(a[0] % 2 == 0) {
//					ans = "first";
//				}else {
//					ans = "second";
//				}
//			}
//			System.out.println(ans);
//			System.exit(0);
//		}
		if(N == 1) {
			if(a[0] % 2 == 0) {
				System.out.println("second");
			}else {
				System.out.println("first");
			}
			System.exit(0);
		}
		if(a[N - 2] == 1) {
			System.out.println("first");
			System.exit(0);
		}
		for(int i = 0; i < N; i++) {
			sum += a[i];
			max = Math.max(max, a[i]);
		}
		if(a[N - 1] == a[0]) {
			if(a[0] == 1) {
				System.out.println("first");
			}else {
				if(a[0] % 2 == 0) {
					System.out.println("second");
				}else {
					System.out.println("first");
				}
			}
			System.exit(0);
		}
		if(sum % 2 == 1) {
			System.out.println("first");
		}else {
			System.out.println("second");
		}
	}
}