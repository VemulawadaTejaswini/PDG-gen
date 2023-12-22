import java.util.Scanner;


public class Main{

	static char[][] input = new char[9][4];
	static char[][] puzzles = new char[9][4];
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int cnt = Integer.parseInt(s.nextLine());
		for(int i=0 ; i<cnt ; i++) {
			String[] tmp = s.nextLine().split(" ");
			for(int j=0 ; j<9 ; j++) {
				input[j] = tmp[j].toCharArray();
			}
			boolean[] isUsed = new boolean[9];
			System.out.println(solve(0, isUsed));
		}
	}

	public static int solve(int position, boolean[] isUsed) {
		if(position == 9)
			return 1;
		int cnt = 0;
		for(int i=0 ; i<9 ; i++) {
			// ??¢???????±?????????????????????????????????´???
			if(isUsed[i])
				continue;
			char[] puzzle = input[i];
			puzzles[position] = puzzle;
			for(int j=0 ; j<4 ; j++) {
				if(check(position)) {
					isUsed[i] = true;
					cnt += solve(position+1, isUsed);
					isUsed[i] = false;
				}
				rotate(position);
			}
		}
		puzzles[position] = null;
		return cnt;
	}

	public static boolean check(int position) {
		boolean result = false;
		switch (position) {
		case 0:
			result = true;
			break;
		case 1:
			if(puzzles[0][1] == 'r') {
				if(puzzles[1][3] == 'R')
					result = true;
			}else if(puzzles[0][1] == 'g') {
				if(puzzles[1][3] == 'G')
					result = true;
			}else if(puzzles[0][1] == 'b') {
				if(puzzles[1][3] == 'B')
					result = true;
			}else if(puzzles[0][1] == 'w') {
				if(puzzles[1][3] == 'W')
					result = true;
			}else if(puzzles[0][1] == 'R') {
				if(puzzles[1][3] == 'r')
					result = true;
			}else if(puzzles[0][1] == 'G') {
				if(puzzles[1][3] == 'g')
					result = true;
			}else if(puzzles[0][1] == 'B') {
				if(puzzles[1][3] == 'b')
					result = true;
			}else if(puzzles[0][1] == 'W') {
				if(puzzles[1][3] == 'w')
					result = true;
			}
			break;
		case 2:
			if(puzzles[1][1] == 'r') {
				if(puzzles[2][3] == 'R')
					result = true;
			}else if(puzzles[1][1] == 'g') {
				if(puzzles[2][3] == 'G')
					result = true;
			}else if(puzzles[1][1] == 'b') {
				if(puzzles[2][3] == 'B')
					result = true;
			}else if(puzzles[1][1] == 'w') {
				if(puzzles[2][3] == 'W')
					result = true;
			}else if(puzzles[1][1] == 'R') {
				if(puzzles[2][3] == 'r')
					result = true;
			}else if(puzzles[1][1] == 'G') {
				if(puzzles[2][3] == 'g')
					result = true;
			}else if(puzzles[1][1] == 'B') {
				if(puzzles[2][3] == 'b')
					result = true;
			}else if(puzzles[1][1] == 'W') {
				if(puzzles[2][3] == 'w')
					result = true;
			}
			break;
		case 3:
			if(puzzles[0][2] == 'r') {
				if(puzzles[3][0] == 'R')
					result = true;
			}else if(puzzles[0][2] == 'g') {
				if(puzzles[3][0] == 'G')
					result = true;
			}else if(puzzles[0][2] == 'b') {
				if(puzzles[3][0] == 'B')
					result = true;
			}else if(puzzles[0][2] == 'w') {
				if(puzzles[3][0] == 'W')
					result = true;
			}else if(puzzles[0][2] == 'R') {
				if(puzzles[3][0] == 'r')
					result = true;
			}else if(puzzles[0][2] == 'G') {
				if(puzzles[3][0] == 'g')
					result = true;
			}else if(puzzles[0][2] == 'B') {
				if(puzzles[3][0] == 'b')
					result = true;
			}else if(puzzles[0][2] == 'W') {
				if(puzzles[3][0] == 'w')
					result = true;
			}
			break;
		case 4:
			if((puzzles[1][2] == 'r' && puzzles[4][0] == 'R') ||
					(puzzles[1][2] == 'g' && puzzles[4][0] == 'G') ||
					(puzzles[1][2] == 'b' && puzzles[4][0] == 'B') ||
					(puzzles[1][2] == 'w' && puzzles[4][0] == 'W') ||
					(puzzles[1][2] == 'R' && puzzles[4][0] == 'r') ||
					(puzzles[1][2] == 'G' && puzzles[4][0] == 'g') ||
					(puzzles[1][2] == 'B' && puzzles[4][0] == 'b') ||
					(puzzles[1][2] == 'W' && puzzles[4][0] == 'w')) {
				if(puzzles[3][1] == 'r' && puzzles[4][3] == 'R')
					result = true;
				else if(puzzles[3][1] == 'g' && puzzles[4][3] == 'G')
					result = true;
				else if(puzzles[3][1] == 'b' && puzzles[4][3] == 'B')
					result = true;
				else if(puzzles[3][1] == 'w' && puzzles[4][3] == 'W')
					result = true;
				else if(puzzles[3][1] == 'R' && puzzles[4][3] == 'r')
					result = true;
				else if(puzzles[3][1] == 'G' && puzzles[4][3] == 'g')
					result = true;
				else if(puzzles[3][1] == 'B' && puzzles[4][3] == 'b')
					result = true;
				else if(puzzles[3][1] == 'W' && puzzles[4][3] == 'w')
					result = true;
			}
			break;
		case 5:
			if((puzzles[2][2] == 'r' && puzzles[5][0] == 'R') ||
					(puzzles[2][2] == 'g' && puzzles[5][0] == 'G') ||
					(puzzles[2][2] == 'b' && puzzles[5][0] == 'B') ||
					(puzzles[2][2] == 'w' && puzzles[5][0] == 'W') ||
					(puzzles[2][2] == 'R' && puzzles[5][0] == 'r') ||
					(puzzles[2][2] == 'G' && puzzles[5][0] == 'g') ||
					(puzzles[2][2] == 'B' && puzzles[5][0] == 'b') ||
					(puzzles[2][2] == 'W' && puzzles[5][0] == 'w')) {
				if(puzzles[4][1] == 'r' && puzzles[5][3] == 'R')
					result = true;
				else if(puzzles[4][1] == 'g' && puzzles[5][3] == 'G')
					result = true;
				else if(puzzles[4][1] == 'b' && puzzles[5][3] == 'B')
					result = true;
				else if(puzzles[4][1] == 'w' && puzzles[5][3] == 'W')
					result = true;
				else if(puzzles[4][1] == 'R' && puzzles[5][3] == 'r')
					result = true;
				else if(puzzles[4][1] == 'G' && puzzles[5][3] == 'g')
					result = true;
				else if(puzzles[4][1] == 'B' && puzzles[5][3] == 'b')
					result = true;
				else if(puzzles[4][1] == 'W' && puzzles[5][3] == 'w')
					result = true;
			}
			break;
		case 6:
			if(puzzles[3][2] == 'r') {
				if(puzzles[6][0] == 'R')
					result = true;
			}else if(puzzles[3][2] == 'g') {
				if(puzzles[6][0] == 'G')
					result = true;
			}else if(puzzles[3][2] == 'b') {
				if(puzzles[6][0] == 'B')
					result = true;
			}else if(puzzles[3][2] == 'w') {
				if(puzzles[6][0] == 'W')
					result = true;
			}else if(puzzles[3][2] == 'R') {
				if(puzzles[6][0] == 'r')
					result = true;
			}else if(puzzles[3][2] == 'G') {
				if(puzzles[6][0] == 'g')
					result = true;
			}else if(puzzles[3][2] == 'B') {
				if(puzzles[6][0] == 'b')
					result = true;
			}else if(puzzles[3][2] == 'W') {
				if(puzzles[6][0] == 'w')
					result = true;
			}
			break;
		case 7:
			if((puzzles[4][2] == 'r' && puzzles[7][0] == 'R') ||
					(puzzles[4][2] == 'g' && puzzles[7][0] == 'G') ||
					(puzzles[4][2] == 'b' && puzzles[7][0] == 'B') ||
					(puzzles[4][2] == 'w' && puzzles[7][0] == 'W') ||
					(puzzles[4][2] == 'R' && puzzles[7][0] == 'r') ||
					(puzzles[4][2] == 'G' && puzzles[7][0] == 'g') ||
					(puzzles[4][2] == 'B' && puzzles[7][0] == 'b') ||
					(puzzles[4][2] == 'W' && puzzles[7][0] == 'w')) {
				if(puzzles[6][1] == 'r' && puzzles[7][3] == 'R')
					result = true;
				else if(puzzles[6][1] == 'g' && puzzles[7][3] == 'G')
					result = true;
				else if(puzzles[6][1] == 'b' && puzzles[7][3] == 'B')
					result = true;
				else if(puzzles[6][1] == 'w' && puzzles[7][3] == 'W')
					result = true;
				else if(puzzles[6][1] == 'R' && puzzles[7][3] == 'r')
					result = true;
				else if(puzzles[6][1] == 'G' && puzzles[7][3] == 'g')
					result = true;
				else if(puzzles[6][1] == 'B' && puzzles[7][3] == 'b')
					result = true;
				else if(puzzles[6][1] == 'W' && puzzles[7][3] == 'w')
					result = true;
			}
			break;
		case 8:
			if((puzzles[5][2] == 'r' && puzzles[8][0] == 'R') ||
					(puzzles[5][2] == 'g' && puzzles[8][0] == 'G') ||
					(puzzles[5][2] == 'b' && puzzles[8][0] == 'B') ||
					(puzzles[5][2] == 'w' && puzzles[8][0] == 'W') ||
					(puzzles[5][2] == 'R' && puzzles[8][0] == 'r') ||
					(puzzles[5][2] == 'G' && puzzles[8][0] == 'g') ||
					(puzzles[5][2] == 'B' && puzzles[8][0] == 'b') ||
					(puzzles[5][2] == 'W' && puzzles[8][0] == 'w')) {
				if(puzzles[7][1] == 'r' && puzzles[8][3] == 'R')
					result = true;
				else if(puzzles[7][1] == 'g' && puzzles[8][3] == 'G')
					result = true;
				else if(puzzles[7][1] == 'b' && puzzles[8][3] == 'B')
					result = true;
				else if(puzzles[7][1] == 'w' && puzzles[8][3] == 'W')
					result = true;
				else if(puzzles[7][1] == 'R' && puzzles[8][3] == 'r')
					result = true;
				else if(puzzles[7][1] == 'G' && puzzles[8][3] == 'g')
					result = true;
				else if(puzzles[7][1] == 'B' && puzzles[8][3] == 'b')
					result = true;
				else if(puzzles[7][1] == 'W' && puzzles[8][3] == 'w')
					result = true;
			}
			break;
		}
		return result;
	}

	public static void rotate(int position) {
		char[] tmp = puzzles[position];
		char tm = tmp[0];
		for(int i=1 ; i<tmp.length ; i++) {
			tmp[i-1] = tmp[i];
		}
		tmp[tmp.length-1] = tm;
	}
}