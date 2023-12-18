import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int d[] = new int[k];
		String dStr[] = new String[k];
		for (int i = 0; i < k; i++) {
			d[i] = sc.nextInt();
			dStr[i] = String.valueOf(d[i]);
		}
		String nStr = "";
		int result = 0;
		int count = 0;
		for (int i = n; i < 10000; i++) {
			nStr = String.valueOf(i);
			for (int j = 0; j < k; j++) {
				result = nStr.indexOf(dStr[j]);
				if (result != -1) {
					count = 1;
					break;
				}
				if (j == k - 1 & result == -1) {
					System.out.println(i);
					return;
				}
			}
			if (count == 1) {
				count = 0;
				continue;
			}
		}
	}
}