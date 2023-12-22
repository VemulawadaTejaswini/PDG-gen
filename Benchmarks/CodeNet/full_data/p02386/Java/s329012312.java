import java.util.ArrayList;
import java.util.List;
import java.io.*;
import java.util.Scanner;
import java.math.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		int[][] sq = new int[6][n];
		for(int i = 0;i < n;i++){
			String tmp = scan.nextLine();
			for(int j = 0;j < 6;j++){
				sq[j][i] = Integer.parseInt(tmp.split(" ")[j]);
			}
		}
		for(int i = 0;i < n;i++){
			for(int j = 0;j < n;j++){
				if(i != j){
				if(check(sq[0][i],sq[1][i] , sq[2][i], sq[3][i], sq[4][i], sq[5][i], sq[0][j], sq[1][j], sq[2][j], sq[3][j], sq[4][j], sq[5][j])){
					System.out.println("No");
					return;
				}
			}
			}
		}
		System.out.println("Yes");
	}

	public static boolean check(int one, int two, int three, int four, int five, int six, int one2, int two2, int three2,
			int four2, int five2, int six2) {
		String s = "EEEENEEEENEEEESSSEEEENESEEEENWWSEEEE";

		for (int i = 0; i < s.length(); i++) {
			int tmp;
			if (s.charAt(i) == 'E') {
				tmp = one;
				one = four;
				four = six;
				six = three;
				three = tmp;
			} else if (s.charAt(i) == 'N') {
				tmp = one;
				one = two;
				two = six;
				six = five;
				five = tmp;
			} else if (s.charAt(i) == 'S') {
				tmp = one;
				one = five;
				five = six;
				six = two;
				two = tmp;
			} else if (s.charAt(i) == 'W') {
				tmp = one;
				one = three;
				three = six;
				six = four;
				four = tmp;
			}
			if (one == one2 && two == two2 && three == three2 && four == four2 && five == five2 && six == six2) {
				return true;
			}
		}
		return false;
	}
}
// }

