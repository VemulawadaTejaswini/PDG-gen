import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int rest = n;
		int[] point = new int[n];
		int maxIndex = 0;
		for (int i = 0; i < n; i++) {
			point[i] = scanner.nextInt();
			if (point[i] > point[maxIndex]) {
				maxIndex = i;
			}
		}
		int count = 0;
		while (rest > 0) {
			count++;
			int nextMax = 0;
			for (int i = 0; i < n; i++) {
				if (i == maxIndex) {
					point[i] -= a;
				} else {
					point[i] -= b;
				}
				if (point[i] <= 0) {
					rest--;
					continue;
				}
				if (point[i] > point[nextMax]) {
					nextMax = i;
				}
			}
			maxIndex = nextMax;	
		}
		System.out.println(count);
		scanner.close();
	}
}
