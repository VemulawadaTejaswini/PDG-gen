import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		String s = sc.nextLine();
		Board b = new Board(s);
		int maxGcd = 0;
		int gcd;
		for(int i = 0; i < b.length; i++) {
			gcd = b.getBoardGcd(i);
			if(maxGcd < gcd) {
				maxGcd = gcd;
			}
		}
		System.out.println(maxGcd);
	}
}
class Board{
	int[] board;
	int length;
	boolean[] dup;
	int dupGcd = -1;
	Board(String s){
		String[] sAry = s.split(" ");
		board = new int[sAry.length];
		dup = new boolean[sAry.length];
		length = board.length;
		for(int i = 0; i < sAry.length; i++) {
			board[i] = Integer.parseInt(sAry[i]);
			dup[i] = false;
			for(int i2 = 0; i2 < i; i2++) {
				if(board[i] == board[i2]){
					dup[i] = true;
					break;
				}
			}
		}
	}
	int getBoardGcd(int n) {
		if(dup[n] && dupGcd > 0) {
			return dupGcd;
		}
		int gcd = -1;
		for (int i = 0; i < board.length; i++) {
			if(i != n) {
				gcd = getGcd(gcd, board[i]);
			}
		}
//		System.out.println(gcd);
		if(dup[n]) {
			dupGcd = gcd;
		}
		return gcd;
	}
	int getGcd(int i, int i2) {
		int max = Math.max(i, i2);
		int min = Math.min(i, i2);
		if(min < 0) {
			return max;
		}
		int mod = max % min;
		if(mod == 0) {
			return min;
		}
		return getGcd(min, mod);
	}
}
