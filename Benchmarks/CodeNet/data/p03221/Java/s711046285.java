import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int m = sc.nextInt();
		ArrayList<Integer> al[] = new ArrayList[n];
		for (int i = 0; i < n; i++) {
			al[i] = new ArrayList<>();
		}
		int p[][] = new int[m][2];
		for (int i = 0; i < m; i++) {
			p[i][0] = sc.nextInt() - 1;
			p[i][1] = sc.nextInt();
			al[p[i][0]].add(p[i][1]);
		}
		for (int i = 0; i < n; i++) {
			Collections.sort(al[i]);
		}

		for (int i = 0; i < m; i++) {
			System.out.print(String.format("%06d", p[i][0] + 1));
			System.out.println(String.format("%06d", al[p[i][0]].indexOf(p[i][1]) + 1));
		}

	}
}
