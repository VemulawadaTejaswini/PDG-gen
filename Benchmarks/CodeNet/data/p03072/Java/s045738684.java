import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sc.next());
		}
		int max = a[0];
		int sum = 1;
		for (int i = 1; i < n; i++) {
			if (a[i] >= max) {
				sum++;
				max = a[i];
			}
		}
		System.out.println(sum);
	}

}
