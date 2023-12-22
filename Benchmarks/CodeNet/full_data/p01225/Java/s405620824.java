import java.util.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;

// AOJ 2102
public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int TC = sc.nextInt();
		for (int tc = 0; tc < TC; tc++) {
			int[] is = new int[9];
			for (int i = 0; i < 9; i++) is[i] = sc.nextInt();
			Card[] cs = new Card[9];
			for (int i = 0; i < 9; i++) cs[i] = new Card(is[i], sc.next().charAt(0));
			sort(cs);

			boolean ok = true;
			for (int i = 0; i < 7; i += 3) {
				boolean ok2 = false;
				if (cs[i].c == cs[i + 1].c && cs[i].c == cs[i + 2].c) {
					int a = cs[i].n, b = cs[i + 1].n, c = cs[i + 2].n;
					if (a == b && b == c) ok2 = true;
					if ((a + 1) == b && (b + 1) == c) ok2 = true;
				}
				if (!ok2) ok = false;
			}
			if (ok) System.out.println(1);
			else System.out.println(0);
		}
	}
}

class Card implements Comparable<Card> {
	int n;
	char c;
	Card (int n, char c) {
		this.n = n;
		this.c = c;
	}
	
	public int compareTo(Card c) {
		if (this.c == c.c) {
			return this.n - c.n;
		} else {
			return this.c - c.c;
		}
	}	
}