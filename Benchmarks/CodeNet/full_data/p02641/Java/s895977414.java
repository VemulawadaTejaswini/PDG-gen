import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt(), n = scn.nextInt();
		int[] arr = new int[101];
		for (int i = 0; i < n; i++) {
			arr[scn.nextInt()] = 1;
		}
		if (arr[x] == 0) {
			System.out.println(x);
		} else {
			int left = x - 1, right = x + 1;
			int ans = Integer.MAX_VALUE;
			while (left >= 0 && right < 101) {
				if (arr[left] == 0) {
					ans = left;
					break;
				} else {
					left--;
				}
				if (arr[right] == 0) {
					ans = right;
					break;
				} else {
					right++;
				}
			}
			System.out.println(ans);
		}
	}
}
