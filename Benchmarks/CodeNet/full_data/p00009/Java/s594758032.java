import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);

		do {
			int n = sc.nextInt();
			System.out.println( solve(n) );
		} while ( sc.hasNext() );
	}

	public static int solve(int n) {
		if (n == 1) return 0;
		if (n == 2) return 1;

		LinkedList<Integer> list = new LinkedList<>();
		list.add(2);
		for (int i = 3; i <= n; i = i + 2) {
			list.add(i);
		}

		for (int i = 1; i < list.size(); i++) {
			int p = list.get(i);
			for (int j = i + 1; j < list.size(); ) { // list[0] = 2, list[1] = 3, list[2] = 5,
				if ( list.get(j) % p == 0 ) {
					list.remove(j);
				} else {
					j++;
				}
			}
		}
		return list.size();
	}
}