import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		long[] a = new long[N];
		for(int i = 0; i < N; i++) {
			a[i] = Long.parseLong(sc.next());
		}

		long result = 0;
		for(int l = 0; l < N; l++) {
			long min = Long.MAX_VALUE;
			for(int r = l; r < N; r++) {
				if(a[r] < min) {
					min = a[r];
				}
				result += min;
			}
		}

		System.out.println(result);
	}

}
