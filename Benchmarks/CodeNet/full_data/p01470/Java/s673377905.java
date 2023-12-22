import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	while (in.hasNext()) {
	 int count = in.nextInt();
	 double n = 0, d = 1;
	 for (int i = 0; i < count; i++) {
		int op = in.nextInt();
		long num = in.nextLong();
		switch (op) {
		case 2:
		 num = -num;
		case 1:
		 n = n + (d * num);
		 break;
		case 3:
		 if (num != 0 && d % num == 0) {
			d = d / num;
		 } else {
			n = n * num;
		 }
		 break;
		case 4:
		 if (num != 0 && n % num == 0) {
			n = n / num;
		 }
		 else {
			d = d * num;
		 }
		 break;
		}
// long gcd = gcd(n, d);
// n = n / gcd;
// d = n / gcd;
// if (n == 0) {
// d = 1;
// }
	 }
	 System.out.println((int) (n / d));
	}
 }

// static long gcd(long a, long b) {
// if (b == 0) return a;
// return gcd(b, a % b);
// }
}