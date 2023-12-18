import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 3add el arkam
		int[] arr = new int[n];
		int flag = 0;
		for (int i =0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		for (int i = 0; i < n-1; i++) {
			if (arr[i] == arr[i + 1]) {
				flag = 1;
				break;

			}

		}
		if (flag == 1) {
			System.out.println("NO");
		} else {
			System.out.println("YES");
		}

	}

}
