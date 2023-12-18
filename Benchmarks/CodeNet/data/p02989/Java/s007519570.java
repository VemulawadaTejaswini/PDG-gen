import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		int[] pro = new int[n];

		for (int i = 0; i < n; i++) {
			pro[i] = Integer.parseInt(sc.next());
		}

		Arrays.sort(pro);

		System.out.println(pro[n / 2] - pro[n / 2 - 1]);
	}
}