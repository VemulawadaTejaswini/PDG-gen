import java.util.*;

public class Main {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		String cards = new String();
		for (;;) {
			cards = sc.next();
			if("-".equals(cards)) break;
			int m = sc.nextInt();
			for(int i = 0; i < m; i++) {
				int h = sc.nextInt();
				cards = cards.substring(h,cards.length()) + cards.substring(0,h);
			}
			System.out.println(cards);
		}
	}
}