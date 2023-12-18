import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		String[] temp   = scanner.nextLine().split(" ");
		long[] alist     = new long[n];
		long min = 0;

		alist[0] = Long.parseLong(temp[0]);
		alist[1] = Long.parseLong(temp[1]);
		min = minbai(Math.max(alist[0],alist[1]),Math.min(alist[0],alist[1]));

		for(int i = 2; i < n; i++) {

			alist[i] = Long.parseLong(temp[i]);
			min = minbai(Math.max(min,alist[i]),Math.min(min,alist[i]));

		}

		long bsum = 0;
		for(int i = 0; i < n; i++) {

			bsum += (min / alist[i]);


		}
		long mod = 1000000007;
		System.out.println(bsum % mod);

	}

	public static long gcd(long x, long y) {

		if(x % y == 0) {

			return y;

		}else {

			return gcd(y, x % y);

		}

	}

	public static long minbai(long x, long y) {

		return x * y / gcd(x,y);

	}

}