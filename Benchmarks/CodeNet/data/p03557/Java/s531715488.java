import java.util.*;

public class Main {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arrA = new int[n];
		int[] arrB = new int[n];
		int[] arrC = new int[n];
		for (int i = 0; i < n; i++) {
			arrA[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			arrB[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			arrC[i] = sc.nextInt();
		}
		int[] arrCountB = new int[n];
		for (int i = 0; i < n; i++) {
			int count = 0;
			for (int j = 0; j < n; j++) {
				if (arrB[i] < arrC[j]) {
					count++;
				}
			}
			arrCountB[i] = count;
		}
		int total = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (arrA[i] < arrB[j]) {
					total += arrCountB[j];
				}
			}
		}
		System.out.println(total);
	}
}
