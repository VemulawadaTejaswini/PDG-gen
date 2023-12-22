import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner scan = new Scanner(System.in);
		// Scanner scan = new Scanner(new File("c:\\0520-input.txt"));

		while (scan.hasNext()) {
			int n = scan.nextInt();
			if (n == 0)
				break;
			Player[] p = new Player[2];
			p[0] = new Player(n);
			p[1] = new Player(n);
			p[1].dealAll();
			for (int i = 0; i < n; i++) {
				int x = scan.nextInt();
				p[0].deal(x);
				p[1].remove(x);
			}
			game(p, 0, 0);
			System.out.println(p[1].remain());
			System.out.println(p[0].remain());
		}
		scan.close();
		System.exit(0);
	}

	private static void game(Player[] p, int tern, int card) {
		for (int i = 0; i < p.length; i++)
			if (p[i].isEmpty())
				return;
		int pay = p[tern].pay(card);
		int next = tern + 1;
		if (next == p.length)
			next = 0;
		game(p, next, pay);

	}
}

class Player {
	boolean[] card;
	int piece = 0;

	public Player(int n) {
		card = new boolean[2 * n + 1];
	}

	public int pay(int cur) {
		for (int i = cur + 1; i < card.length; i++)
			if (card[i]) {
				this.remove(i);
				return i;
			}
		return 0;
	}

	public boolean isEmpty() {
		if (piece == 0)
			return true;
		else
			return false;
	}

	public int remain() {
		/*
		 * int r = 0; for (int i = 1; i < card.length; i++) if (card[i]) r += i;
		 * return r;
		 */
		return piece;
	}

	public void remove(int x) {
		card[x] = false;
		piece--;
	}

	public void deal(int x) {
		card[x] = true;
		piece++;
	}

	public void dealAll() {
		for (int i = 1; i < card.length; i++) {
			card[i] = true;
			piece++;
		}
	}

}