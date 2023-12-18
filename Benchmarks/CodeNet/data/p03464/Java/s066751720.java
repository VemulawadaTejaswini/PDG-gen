import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int[] a = new int[k];
		for (int i = 0; i < k; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();
		int ans = 0;
		int[] kouho = new int[] { 2, 3 };
		for (int i = 0; i < k - 1; i++) {
			boolean success = false;
			for (int j = 0; j < kouho.length; j++) {
				if (kouho[j] % a[k - i - 2] == 0) {
					int tmp = kouho[j];
					// System.out.println(Arrays.toString(kouho));
					kouho = new int[tmp];
					for (int l = 0; l < tmp; l++) {
						kouho[l] = tmp + l;
					}
					success = true;
					break;
				}
			}
			if (!success) {
				ans = -1;
				break;
			}
		}
		if (ans != -1) {
			System.out.print(kouho[0]);
			kouho = new int[] { 2, 3 };
			for (int i = 0; i < k - 1; i++) {
				boolean success = false;
				for (int j = 0; j < kouho.length; j++) {
					if (kouho[kouho.length - j - 1] % a[k - i - 2] == 0) {
						int tmp = a[k - i - 2];
						// System.out.println(Arrays.toString(kouho));
						int tmp2 = kouho[kouho.length - j - 1];
						kouho = new int[tmp];
						for (int l = 0; l < kouho.length; l++) {
							kouho[l] = tmp2 + l;
						}
						// System.out.println(Arrays.toString(kouho));
						success = true;
						break;
					}
				}
				if (!success) {
					ans = -1;
					break;
				}
			}
			System.out.print(" " + kouho[kouho.length - 1]);
			System.out.println();
		} else {
			System.out.println("-1");
		}
	}
}