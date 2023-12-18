import java.util.Arrays;
import java.util.Scanner;

public class Main {
	int[] arr = null;


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Main m = new Main();
		m.arr = new int[n];

		for (int i=0; i<n; i++) {
			m.arr[i] = scan.nextInt();

		}
		Arrays.sort(m.arr);

		System.out.println(m.arr[n/2]);
		scan.close();
	}
}
