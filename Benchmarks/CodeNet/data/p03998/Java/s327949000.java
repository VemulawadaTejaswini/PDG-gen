import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String ans = "NONE";
		
		Player a = new Player(scanner.next().toCharArray());
		Player b = new Player(scanner.next().toCharArray());
		Player c = new Player(scanner.next().toCharArray());
		
		
		char nc = a.cards.poll();
		while (true) {
			if (nc == 'a') {
				if (a.cards.isEmpty()) {
					ans = "A";
					break;
				}
				nc = a.cards.poll();	
			}else if (nc == 'b') {
				if (b.cards.isEmpty()) {
					ans = "B";
					break;
				}
				nc = b.cards.poll();
			}else if (nc == 'c') {
				if (c.cards.isEmpty()) {
					ans = "C";
					break;
				}
				nc = c.cards.poll();
			}
		}
		System.out.println(ans);
		
		scanner.close();
	}
	static class Player{
		private Queue<Character> cards;
		
		public Player(char[] source) {
			cards = new ArrayDeque<Character>();
			for (int i = 0; i < source.length; i++) {
				cards.add(source[i]);
			}
		}		
	}
}