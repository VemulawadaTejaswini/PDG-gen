import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] org = new int[]{1, 4, 7, 9};
		int[] arr = new int[4];
		for (int i = 0; i < 4; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		for (int i = 0; i < 4; i++) {
			if (arr[i] != org[i]) {
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
	}
}
