import java.util.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;

// AOJ 0071
public class Main {
	static Scanner sc = new Scanner(System.in);
	static char[][] cs = new char[8][8];
	public static void main(String[] args) {
		int TC = sc.nextInt();
		for (int tc = 1; tc <= TC; tc++) {
			for (int i = 0; i < 8; i++) cs[i] = sc.next().toCharArray();
			rec(sc.nextInt() - 1, sc.nextInt() - 1);
			System.out.println("Data " + tc + ":");
			for (int i = 0; i < 8; i++) System.out.println(String.valueOf(cs[i]));
		}
	}
	
	static int[] dx = {0, 1, 0, -1}, dy = {1, 0, -1, 0};
	public static void rec(int x, int y) {
		cs[y][x] = '0';
		for (int k = 0; k < 4; k++) {
			for (int C = 1; C <= 3; C++) {
				int nx = x + dx[k] * C, ny = y + dy[k] * C;
				if (inField(ny, nx) && cs[ny][nx] == '1') {
					rec(nx, ny);
				}
			}
		}
	}
	
	public static boolean inField(int x, int y) {
		return (x >= 0 && x < 8 && y >= 0 && y < 8);
	}
}