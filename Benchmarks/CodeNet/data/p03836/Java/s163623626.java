import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sx = sc.nextInt();
		int sy = sc.nextInt();
		int tx = sc.nextInt();
		int ty = sc.nextInt();
		
		String S = "";
		S = keiro(S, "y", ty, sy);
		S = keiro(S, "x", tx, sx);
		S = keiro(S, "y", sy, ty);
		S = keiro(S, "x", sx, tx);
		
		if(ty >= sy) {
			S += "D";
			S = keiro(S, "x", tx, sx);
			if(tx >= sx) {
				S += "R";
				S = keiro(S, "y", ty + 1, sy);
				S += "LU";
				S = keiro(S, "x", tx + 1, sx);
				S = keiro(S, "y", ty + 1, sy);
				S += "R";
			} else if(tx < sx) {
				S += "L";
				S = keiro(S, "y", ty + 1, sy);
				S += "RU";
				S = keiro(S, "x", tx, sx + 1);
				S = keiro(S, "y", ty + 1, sy);
				S += "L";
			}

		} else if(ty < sy) {
			S += "U";
			S = keiro(S, "x", tx, sx);
			if(tx >= sx) {
				S += "R";
				S = keiro(S, "y", ty, sy + 1);
				S += "LD";
				S = keiro(S, "x", tx + 1, sx);
				S = keiro(S, "y", ty, sy + 1);
				S += "R";
			} else if(tx < sx) {
				S += "L";
				S = keiro(S, "y", ty, sy + 1);
				S += "RD";
				S = keiro(S, "x", tx, sx + 1);
				S = keiro(S, "y", ty, sy + 1);
				S += "L";
			}
		}
		System.out.println(S);
	}
	
	public static String keiro(String x, String dir, int a, int b) {
		for(int i = 0; i < Math.abs(a - b); i++) {
			if(dir == "y") {
				if(a >= b) {
					x += "U";
				} else if(a < b) {
					x += "D";
				}
			} else if(dir == "x") {
				if(a >= b) {
					x += "R";
				} else if(a < b) {
					x += "L";
				}
			}
		}
		return x;
	}
}
