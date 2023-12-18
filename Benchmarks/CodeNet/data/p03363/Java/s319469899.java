import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);


		int n = Integer.parseInt(sc.next());

		long[] a = new long[n];
		for(int i = 0; i < n; i++) {
			a[i] = Long.parseLong(sc.next());
		}

		int count = 0;
		long[] sumAbsPart = new long[n];
		long sumAbs = 0;
		for(int i = n - 1; i >= 0; i--) {
			sumAbsPart[i] = sumAbs;
			sumAbs += Math.abs(a[i]);
		}
		for(int i = 0; i < n; i++) {
			long sum = 0;
			for(int j = i; j < n; j++) {
				sum += a[j];
				if(sum == 0) {
					count++;
				}else if(Math.abs(sum) > sumAbsPart[i]) {
					break;
				}
			}
		}

		System.out.println(count);

	}
}