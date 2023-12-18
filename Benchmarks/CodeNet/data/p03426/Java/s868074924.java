import java.io.IOException;
import java.util.Scanner;

public class Main {
	/**
	 * Main method.
	 */
	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		
		final int H = s.nextInt();
		final int W = s.nextInt();
		final int D = s.nextInt();
		
		int[][] field = new int[H][W];
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				field[i][j] = s.nextInt();
			}
		}
		
		final int Q = s.nextInt();
		
		for (int i = 0; i < Q; i++) {
			int L = s.nextInt();
			int R = s.nextInt();
			
			int x = L;
			Pos pos = new Pos();
			Pos value = pos.calcPos(x, field);
			int prePosI = value.i + 1;
			int prePosJ = value.j + 1;
			int posI = prePosI;
			int posJ = prePosJ;
			
			//System.out.println(prePosI + " + " + prePosJ);
			
			int answer = 0;
			while (x != R) {
				x += D;
				pos = new Pos();
				value = pos.calcPos(x, field);
				posI = value.i + 1;
				posJ = value.j + 1;
				
				//System.out.println(posI + " + " + posJ);
				answer += Math.abs(posI - prePosI) + Math.abs(posJ - prePosJ);
				
				prePosI = posI;
				prePosJ = posJ;
			}
			
			System.out.println(answer);
		}
 
	}
	
	static class Pos {
		int i;
		int j;
	 
		public Pos calcPos(int x, int[][] field) {
			Pos pos = new Pos();
			for (int i = 0; i < field.length; i++) {
				for (int j = 0; j < field[0].length; j++) {
					if (field[i][j] == x) {
						pos.i = i;
						pos.j = j;
					}
				}
			}
			return pos;
		}
	}
}