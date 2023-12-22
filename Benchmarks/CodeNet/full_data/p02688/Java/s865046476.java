
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] a = new int[N + 1];
		while (K-- > 0) {
			int x = sc.nextInt();
			while (x-- > 0) {
				a[sc.nextInt()] = 1;
			}
		}
		int count = 0;
		for (int i = 1; i < a.length; i++) {
			if (a[i] != 1)
				count++;
		}
		System.out.println(count);
	}

}
