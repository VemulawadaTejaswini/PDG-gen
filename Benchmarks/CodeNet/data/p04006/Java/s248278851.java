import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long N = scanner.nextLong();
		long x = scanner.nextLong();
		long[] a = new long[(int) N];
		for (int i = 0; i < N; i++) {
			a[i] = scanner.nextLong();
		}
		scanner.close();
		long time = 0;
		for (int i = 0; i < N; i++) {
			long min = Long.MAX_VALUE;
			for (int j = 0; j < N; j++) {
				long abs = Math.abs(j - i);
				if(abs>N/2){
					abs=N-1-abs;
				}
				min = Math.min(abs * x + a[j], min);

			}
			time += min;
		}
		System.out.println(time);
	}
}
