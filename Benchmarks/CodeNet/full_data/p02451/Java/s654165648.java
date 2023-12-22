import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		int q = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		int[] op = new int[q];
		for (int i = 0; i < q; i++) {
			op[i] = sc.nextInt();
		}
		for (int i = 0; i < op.length; i++) {
			if (Arrays.binarySearch(array, op[i]) >= 0) {
				sb.append(1);
			} else {
				sb.append(0);
			}
			sb.append('\n');
		}
		
		System.out.print(sb.toString());
	}
}

