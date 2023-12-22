import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n, m;
		int darts[];
		int sum;
		int max;

		n = sc.nextInt();
		m = sc.nextInt();
		while (n + m != 0) {
			darts = new int[n];
			max = 0;

			for (int i = 0; i < n; i++) {
				darts[i] = sc.nextInt();
			}

			for (int i = 0; i < n; i++) {
				sum = darts[i];
				if (m < sum) {
					break;
				} else if (max < sum) {
					max = sum;
				}
				if (m == max) {
					break;
				}
				for (int j = 0; j < n; j++) {
					sum += darts[j];
					if (m < sum) {
						sum -= darts[j];
						sum -= darts[i];
						break;
					} else if (max < sum) {
						max = sum;
					}
					if (m == max) {
						break;
					}
					for (int k = 0; k < n; k++) {
						sum += darts[k];
						if (m < sum) {
							sum -= darts[k];
							sum -= darts[j];
							break;
						} else if (max < sum) {
							max = sum;
						}
						if (m == max) {
							break;
						}
						for (int l = 0; l < n; l++) {
							sum += darts[l];
							if (m < sum) {
								sum -= darts[l];
								sum -= darts[k];
								break;
							} else if (max < sum) {
								max = sum;
							}
							if (m == max) {
								break;
							}
							sum -= darts[l];
						}
						sum -= darts[k];
					}
					sum -= darts[j];
				}
			}

			System.out.println(max);

			n = sc.nextInt();
			m = sc.nextInt();
		}
	}
}