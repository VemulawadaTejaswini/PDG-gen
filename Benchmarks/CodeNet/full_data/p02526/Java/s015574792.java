

import java.util.ArrayList;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n, q, count = 0;
		ArrayList<Integer> S = new ArrayList<Integer>();
		ArrayList<Integer> T = new ArrayList<Integer>();
		n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			S.add(scan.nextInt());
		}
		q = scan.nextInt();
		for (int i = 0; i < q; i++) {
			T.add(scan.nextInt());
		}
		for (int i = 0; i < n; i++) {
			if (S.contains(T.get(i)))
				count += 1;
		}

		System.out.println(count);
	}

}