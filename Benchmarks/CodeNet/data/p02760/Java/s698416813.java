import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] array = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				array[i][j] = sc.nextInt();
			}
		}
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int b = sc.nextInt();
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 3; k++) {
					if (array[j][k] == b) {
						array[j][k] = -1;
					}
				}
			}
		}
		boolean flag = false;
		for (int i = 0; i < 3; i++) {
			boolean flag2 = true;
			for (int j = 0; j < 3; j++) {
				if (array[i][j] >= 0) {
					flag2 = false;
					break;
				}
			}
			if (flag2) {
				flag = true;
				break;
			}
		}
		for (int i = 0; i < 3; i++) {
			boolean flag2 = true;
			for (int j = 0; j < 3; j++) {
				if (array[j][i] >= 0) {
					flag2 = false;
					break;
				}
			}
			if (flag2) {
				flag = true;
				break;
			}
		}
		boolean flag2 = true;
		for (int i = 0; i < 3; i++) {
			if (array[i][i] >= 0) {
				flag2 = false;
				break;
			}
		}
		if (flag2) {
			flag = true;
		}
		flag2 = true;
		for (int i = 0; i < 3; i++) {
			if (array[i][2 - i] >= 0) {
				flag2 = false;
				break;
			}
		}
		if (flag2) {
			flag = true;
		}
		if (flag) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
