
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
	Board(String s){
		String[] sAry = s.split(" ");
		board = new int[sAry.length];
		for(int i = 0; i < sAry.length; i++) {
			board[i] = Integer.parseInt(sAry[i]);
		}
		length = board.length;
	}
	int getBoardGcd(int n) {
		int gcd = -1;
		for (int i = 0; i < board.length; i++) {
			if(i != n) {
				gcd = getGcd(gcd, board[i]);
			}
		}
//		System.out.println(gcd);
		return gcd;
	}
	int getGcd(int i, int i2) {
		int max = Math.max(i, i2);
		int min = Math.min(i, i2);
		if(min < 0) {
			return max;
		}
		int gcd = 1;
		if(max % min == 0) {
			return gcd;
		}
		for(int k = 1; k <= min; k++) {
			if(max % k == 0 && min % k == 0) {
				gcd = k;
			}
		}
		return gcd;
	}
}
