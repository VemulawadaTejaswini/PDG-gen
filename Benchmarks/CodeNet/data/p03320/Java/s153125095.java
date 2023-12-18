
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[] small = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 19, 29, 39, 49, 59, 69, 79, 89, 99, 199, 299, 399, 499, 599, 699,
				799, 899, 999, 1099, 1199, 1299, 1399, 1499, 1599, 1699, 1799, 1899, 1999, 2999, 3999, 4999, 5999, 6999,
				7999, 8999, 9999 };

		Scanner scanner = new Scanner(System.in);
		int K = scanner.nextInt();

		int cnt = 0;
		while (true) {
			System.out.println(small[cnt]);
			cnt++;
			if (cnt == K) {
				return;
			}
			if (cnt == small.length) {
				break;
			}
		}

		ArrayList<Long> ar = new ArrayList<>();
		double min = 9999 / S(9999);
		long i = 1;
		int deg = 3;
		while (true) {
			long before =0;
			long suf = makesuf(deg);
			i =10;

			while (true) {
				min = makesuf(deg+2) / S(makesuf(deg+2));
				long n = i * (long)(Math.pow(10, deg)) + makesuf(deg);

				if (min >= (n / S(n))) {
					ar.add(n);
					cnt ++ ;
					if(cnt>=K) {
						printAr(ar);
						return;
					}
				}
				i++;
				if(before>(n / S(n))) {
					ar.add(makesuf(deg+2));
					cnt ++ ;
					if(cnt>=K) {
						printAr(ar);
						return;
					}
					break;
				}
				before = (n / S(n));
			}
			deg ++;
		}

	}

	public static int S(long n) {
		int ans = 0;
		while (n >= 1) {
			ans += n % 10;
			n /= 10;
		}
		return ans;
	}
	public static void printAr(ArrayList<Long> ar) {
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
	}
	public static long makesuf(int i) {
		long rtn = 0;
		for(int j = 0;j < i;j ++) {
			rtn +=9;
			rtn *= 10;
		}
		return rtn /10;
	}

}
