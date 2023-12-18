import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		char[][] field = new char[h][];
		for (int i = 0; i < h; i++) {
			field[i] = sc.next().toCharArray();
		}
		Num[][] hors = new Num[h][w];
		for (int i = 0; i < h; i++) {
			Num num = new Num();
			for (int j = 0; j < w; j++) {
				if (field[i][j] == '#') {
					num = new Num();
					hors[i][j] = num;
					num = new Num();
				} else {
					num.add();
					hors[i][j] = num;
				}
			}
		}
		Num[][] vars = new Num[h][w];
		for (int i = 0; i < w; i++) {
			Num num = new Num();
			for (int j = 0; j < h; j++) {
				if (field[j][i] == '#') {
					num = new Num();
					vars[j][i] = num;
					num = new Num();
				} else {
					num.add();
					vars[j][i] = num;
				}
			}
		}
		int max = 0;
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				int x = hors[i][j].getVal() + vars[i][j].getVal() - 1;
				if (max < x) {
					max = x;
				}
			}
		}
		System.out.println(max);
	}
	
	static class Num {
		int val;
		
		public Num() {
			val = 0;
		}
		
		public void add() {
			val++;
		}
		
		public int getVal() {
			return val;
		}
	}
}
