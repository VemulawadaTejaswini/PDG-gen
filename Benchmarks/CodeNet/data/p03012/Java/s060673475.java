import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());

		int[] num = new int[n];
		int total = 0;
		int left = 0;
		int min = 1000000000;

		for (int i = 0; i < n; i++) {
			num[i] = Integer.parseInt(sc.next());
			total += num[i];
		}

		for (int i = 0; i < n; i++) {
			left += num[i];
			if(Math.abs((total - left) - left) < min) {
				min = Math.abs((total-left) - left);
			}
		}

		System.out.println(min);
	}
}