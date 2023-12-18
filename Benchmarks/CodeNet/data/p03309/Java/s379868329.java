import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		int sum = 0;
		for(int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
			sum += Math.abs(a[i] - (i + 1));
		}
		System.out.println(sum);
	}
}