import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n+1];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		arr[n] = 1000000000;
//		System.out.println(Arrays.toString(arr));
		String ans = "Yes";
		for (int i = 0; i < n; i++) {
			if (arr[i] <= arr[i+1] - 1) {
				arr[i]--;
			}
			else if (arr[i] <= arr[i+1]) {
				continue;
			}
			else {
				ans = "No";
				break;
			}
		}
		System.out.println(ans);
	}
}