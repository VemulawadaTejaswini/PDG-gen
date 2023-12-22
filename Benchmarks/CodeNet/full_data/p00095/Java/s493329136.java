import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static class Player implements Comparable<Player>{
		int number;
		int fish;
		
		Player(int number, int fish) {
			this.number = number;
			this.fish = fish;
		}

		public int compareTo(Player o) {
			return this.fish == o.fish ? this.number - o.number : o.fish - this.fish;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Player p[];
		int n;
		
		n = sc.nextInt();
		p = new Player[n];
		for (int i = 0; i < n; i++) {
			p[i] = new Player(sc.nextInt(), sc.nextInt());
		}
		Arrays.sort(p);
		System.out.println(p[0].number + " " + p[0].fish);
	}
}