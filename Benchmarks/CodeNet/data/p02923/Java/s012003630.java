import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] h = new int[n];
		int count = 0;
		int max = 0;
		for (int i = 0; i < n; i++) {
			h[i] = sc.nextInt();
		}
		for (int i = 0; i < n - 1; i++) {
			count = 0;
			if (h[i] >= h[i + 1]) {
				for (int j = i; j < n - 1; j++) {
					if (h[j] >= h[j + 1]) {
						count++;
					} else {
						break;
					}
				}
			}
			if (count > max) {
				max = count;
			}
		}
		System.out.println(max);
	}
}