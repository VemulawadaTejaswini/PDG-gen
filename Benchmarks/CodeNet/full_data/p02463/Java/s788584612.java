
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean[] array = new boolean[(int) (1e9 + 1)];
		for (int i = 0; i < n; ++i) {
			array[sc.nextInt()] = true;
		}
		int m = sc.nextInt();
		for (int i = 0; i < m; ++i) {
			array[sc.nextInt()] = true;
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < array.length; i++) {
			if (array[i]) {
				sb.append(i);
				sb.append('\n');
			}
		}
		System.out.print(sb.toString());
	}
}

