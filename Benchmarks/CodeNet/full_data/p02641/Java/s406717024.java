import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt(), n = scn.nextInt();
		int[] arr = new int[102];
		for (int i = 0; i < n; i++) {
			arr[scn.nextInt()] = 1;
		}
		if (arr[x] == 0) {
			System.out.println(x);
		} else {
			int left = x - 1, right = x + 1;
			int ans = Integer.MAX_VALUE;
			while (left >= 0 && right < arr.length) {
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
			while (left < 0 && right < arr.length) {
				if (arr[right] == 0) {
					ans = right;
					break;
				} else {
					right++;
				}
			}
			while (right >= arr.length && left >= 0) {
				if (arr[left] == 0) {
					ans = left;
					break;
				} else {
					left--;
				}
			}
			System.out.println(ans);
		}
	}
}
