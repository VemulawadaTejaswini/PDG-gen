import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		while (N != 0) {
			List<L> list = new ArrayList<L>();
			for (int i = 0; i < N; i++) {
				L l = new L();
				l.name = sc.next();
				int P = sc.nextInt();
				int ABC = sc.nextInt() + sc.nextInt() + sc.nextInt();
				int DE = sc.nextInt() + sc.nextInt();
				int F = sc.nextInt();
				int S = sc.nextInt();
				int M = sc.nextInt();
				int time = ABC + DE * M;
				int money =  F * M * S - P;
				l.money = (double)money / time;
				list.add(l);
			}
			Collections.sort(list);
			Collections.reverse(list);
			for (L l : list) {
				System.out.println(l.name);
			}
			System.out.println("#");
			N = sc.nextInt();
		}
	}
}

class L implements Comparable<L> {
	String name;
	double money;

	@Override
	public int compareTo(L o) {
		if (money > o.money)
			return 1;
		else if (money < o.money)
			return -1;
		else
			return o.name.compareTo(name); 

	}
}