import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = Integer.parseInt(scan.next());
		int[] a = new int[N];
		int sum = 0;
		for (int i = 0; i < N; i++) {
			a[i] = Integer.parseInt(scan.next());
			sum += a[i];
		}
		float ave = sum / N;
		float min_dis = Math.abs(ave - (float)a[0]);
		int min_index = 0;
		for (int i = 1; i < N; i++) {
			if (Math.abs(ave - (float)a[i]) < min_dis) {
				min_dis = Math.abs(ave - a[i]);
				min_index = i;
			}
		}
		System.out.println(min_index);
	}
}
