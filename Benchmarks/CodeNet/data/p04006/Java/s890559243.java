import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int x = scanner.nextInt();
		int[] a = new int[N];
		for (int i = 0; i < N; i++) {
			a[i] = scanner.nextInt();
		}
		scanner.close();
		//int[] times=new int[N];
		int time = 0;
		for (int i = 0; i < N; i++) {
			int min = Integer.MAX_VALUE;
			for (int j = 0; j < N; j++) {
				int abs = Math.abs(j - i);
				min = Math.min(abs * x + a[j], min);

			}
			time += min;
		}
		System.out.println(time);
	}
}
