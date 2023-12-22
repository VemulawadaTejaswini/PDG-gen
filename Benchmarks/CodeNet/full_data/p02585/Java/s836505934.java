import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int length = reader.nextInt(), moves = reader.nextInt();
		long[] p = new long[length], c = new long[length], arr = new long[length];
		for (int i = 0; i < length; i++) {
			p[i] = reader.nextLong();
		}
		for (int i = 0; i < length; i++) {
			c[i] = reader.nextLong();
		}
		for (int i = 0; i < length; i++) {
			long score = 0, next = i, movesLeft = moves, second = 0, cycle = 0;
			while (moves > 0) {
				cycle++;
				score += c[(int) p[(int) next]];
				next = p[(int) next];
				moves--;
				if (next == i) {
					second++;
					if (second == 2) {
						break;
					}
				}
			}
			if (moves == 0) {
				arr[i] = score;
			}
			else {
				score *= moves / cycle;
				moves %= cycle;
				while (moves > 0) {
					score += c[(int) p[(int) next]];
					next = p[(int) next];
					moves--;
				}
			}
		}
		
		reader.close();
	}
	
}
