
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] x = new int[N + 1];
		int i = 1;
		while (N-- > 0) {
			x[i++] = sc.nextInt();
		}
		i = 0;
		for (int j = 1; j < x.length; j++) {
			for (int k = j + 1; k < x.length; k++) {
				if (Math.abs(k - j) == (x[j] + x[k])) {
					i++;
				}
			}
		}
		System.out.println(i);
	}

}
