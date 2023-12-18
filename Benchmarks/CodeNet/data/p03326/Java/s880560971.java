import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		long[][] in = new long[n][3];
		for (int i = 0; i < n; i++) {
			in[i][0] = sc.nextLong();
			in[i][1] = sc.nextLong();
			in[i][2] = sc.nextLong();
		}
		long[] a = new long[n];
		long max = 0, sum = 0;;
		String format = "%".concat(String.valueOf(3)).concat("s");
		String s;
		long h1,h2,h3;
		for (int i = 0; i < 8; i++) {
			s = String.format(format, Integer.toString(i,2)).replace(' ', '0');
			h1 = s.charAt(0)=='0'?1:-1;
			h2 = s.charAt(1)=='0'?1:-1;
			h3 = s.charAt(2)=='0'?1:-1;
			for (int j = 0; j < n; j++) {
				a[j] = h1*in[j][0]+h2*in[j][1]+h3*in[j][2];
			}
			Arrays.parallelSort(a);
			for (int j = 0; j < m; j++) {
				sum += a[n-j-1];
			}
			max = Math.max(max,sum);
			sum = 0;
		}
		System.out.println(max);
		sc.close();
	}
}