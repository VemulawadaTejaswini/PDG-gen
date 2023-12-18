import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long S = Long.parseLong(sc.next());
		int count = 0;//桁数
		long s = S;
		while (s != 0) {
			s /= 10;
			count++;
		}
		int cou = 0;
		long A[] = new long[count];
		for (int i = count - 1; i >= 0; i--) {
			A[i] = S % 10;
			S /= 10;
		}
		for (int i = 0; i < count - 4; i++) {
			for (int j = i + 3; j < count; j++) {
				long cmp = 0;
				int c = 0;
				for (int k = i; k <= j; k++) {
					cmp += A[k] * Math.pow(10, (j - i - c));
					c++;
				}
				if (cmp % 2019 == 0) {
					cou++;
				}
			}
		}
		System.out.println(cou);
	}
}
