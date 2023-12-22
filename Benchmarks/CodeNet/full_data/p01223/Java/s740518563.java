import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 0; i <= N; i++) {
			int M = sc.nextInt();
			int num[] = new int[M];
			for (int j = 0; j < M; j++) {
				num[j] = sc.nextInt();
			}
			int upper_max = 0;
			int down_max = 0;
			for (int j = 0; j < M - 1; j++) {
				if (num[j] < num[j + 1]) {
					if (upper_max < num[j + 1] - num[j])
						upper_max = num[j + 1] - num[j];
				}
				if (num[j] > num[j + 1]) {
					if (down_max < num[j] - num[j + 1])
						down_max = num[j] - num[j + 1];
				}
			}
			System.out.println(upper_max + " " + down_max);
		}
	}
}