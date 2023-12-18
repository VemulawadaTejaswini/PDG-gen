import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
//		for(int i = 2 ; i < 1000 ; i++) {
//			for(int j = 2 ; j < 1000 ; j++) {
//				for(int k = 2 ; k < 1000 ; k++) {
//					if(i % 2 == 0 && j % 2 == 0 && k % 2 == 0 && i + j == j + k && j + k == k + i) {
//						System.out.println(i + " " + j + " " + k);
//					}
//				}
//			}
//		}
		if(a == b && b == c) {
			System.out.println(-1);
			return;
		}
		if(!(a % 2 == 0 && b % 2 == 0 && c % 2 == 0)) {
			System.out.println(1);
			return;
		}
		long ans = 0;
		while(a % 2 == 0 && b % 2 == 0 && c % 2 == 0) {
			ans++;
			long x = a / 2 + b / 2;
			long y = b / 2 + c / 2;
			long z = c / 2 + a / 2;
			a = y;
			b = z;
			c = x;
			System.out.println(a + " " + b + " " + c);
		}
		System.out.println(ans);
	}
}

// a = b/2 + c/2
// b = c/2 + a/2
// c = a/2 + b/2
// a == b == c => b/2 + c/2 == c/2 + a/2 == a/2 + b/2 => b + c == c + a == a + b

