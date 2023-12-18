import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		boolean isAllPlus = true;
		boolean isAllMinus = true;
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			if (arr[i] < 0) {
				isAllPlus = false;
			}
			if (arr[i] > 0) {
				isAllMinus = false;
			}
		}
		int count = 0;
		StringBuilder sb = new StringBuilder();
		if (isAllPlus) {
			for (int i = 0; i < n - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					sb.append(i + 1 + " " + (i + 2) + "\n");
					count++;
				}
			}
			System.out.println(count);
			System.out.println(sb.toString());
			return;
		}
		if (isAllMinus) {
			for (int i = n - 1; i > 0; i--) {
				if (arr[i] < arr[i - 1]) {
					sb.append(i + 1 + " " + (i) + "\n");
					count++;
				}
			}
			System.out.println(count);
			System.out.println(sb.toString());
			return;
		}
		int maxNum = 0;
		int maxAbs = 0;
		for (int i = 0; i < n; i++) {
			if (Math.abs(arr[i]) > maxAbs) {
				maxNum = i;
				maxAbs = Math.abs(i);
			}
		}
		if (arr[maxNum] > 0) {
			for (int i = 0; i < n; i++) {
				if (arr[i] < 0) {
					arr[i] += arr[maxNum];
					sb.append(maxNum + 1 + " " + (i + 1) + "\n");
					count++;
				}
			}
			for (int i = 0; i < n - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					sb.append(i + 1 + " " + (i + 2) + "\n");
					count++;
				}
			}
			System.out.println(count);
			System.out.println(sb.toString());
			return;

		} else {
			for (int i = 0; i < n; i++) {
				if (arr[i] > 0) {
					arr[i] += arr[maxNum];
					sb.append(maxNum + 1 + " " + (i + 1) + "\n");
					count++;
				}
			}
			for (int i = n - 1; i > 0; i--) {
				if (arr[i] < arr[i - 1]) {
					sb.append(i + 1 + " " + (i) + "\n");
					count++;
				}
			}
			System.out.println(count);
			System.out.println(sb.toString());
			return;
		}
	}
}