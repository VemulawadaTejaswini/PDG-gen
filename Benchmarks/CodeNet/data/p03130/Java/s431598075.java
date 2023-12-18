import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[4];
		for (int i = 0; i < 3; i++) {
			arr[sc.nextInt() - 1]++;
			arr[sc.nextInt() - 1]++;
		}
		int one = 0;
		int two = 0;
		for (int x : arr) {
			if (x == 1) {
				one++;
			} else if (x == 2) {
				two++;
			}
		}
		if (one == 2 && two == 2) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
