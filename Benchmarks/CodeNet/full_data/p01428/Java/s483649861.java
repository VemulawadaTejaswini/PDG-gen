import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[][] m = new char[8][];
		for(int i=0;i<8;i++) {
			m[i] = sc.next().toCharArray();
		}
		
		int pass = 0;
		int turn = 1;
		while(true) {
			turn = 1 - turn;
			int max = 0;
			int maxi = -1;
			int maxj = -1;
			for(int i=0;i<8;i++) {
				for(int j=0;j<8;j++) {
					int x = num(m,i,j,turn);
					if (turn == 0) {
						if (x > max) {
							max = x;
							maxi = i;
							maxj = j;
						}
					}else{
						if (x >= max) {
							max = x;
							maxi = i;
							maxj = j;
						}
					}

				}
			}
			if (max == 0) {
				pass++;
				if (pass >= 2) {
					break;
				}
				continue;
			}
			pass = 0;
			put(m, maxi, maxj, turn);
//			print(m);
		}
		print(m);
	}
	
	public static void print(char[][] m) {
		for(int i=0;i<8;i++) {
			System.out.println(m[i]);
		}
	}
	
	public static int num(char[][] m,int si,int sj,int turn) {
		if (m[si][sj] != '.') {
			return 0;
		}
		char me = turn == 0 ? 'o' : 'x';
		char opp = turn == 0 ? 'x' : 'o';
		int sum = 0;
		for(int di=-1;di<=1;di++) {
			for(int dj=-1;dj<=1;dj++) {
				if (di == 0 && dj == 0) {
					continue;
				}
				int ni = si + di;
				int nj = sj + dj;
				int count = 0;
				while(0 <= ni && ni < 8 && 0 <= nj && nj < 8) {
					if (m[ni][nj] == opp) {
						count++;
					}else if(m[ni][nj] == me) {
						sum += count;
						break;
					}else{
						break;
					}
					ni += di;
					nj += dj;
				}
			}
		}
		return sum;
	}
	
	public static void put(char[][] m,int si,int sj,int turn) {
		char me = turn == 0 ? 'o' : 'x';
		char opp = turn == 0 ? 'x' : 'o';
		m[si][sj] = me;
		for(int di=-1;di<=1;di++) {
			for(int dj=-1;dj<=1;dj++) {
				if (di == 0 && dj == 0) {
					continue;
				}
				int ni = si + di;
				int nj = sj + dj;
				int count = 0;
				boolean flag = false;
				while(0 <= ni && ni < 8 && 0 <= nj && nj < 8) {
					if (m[ni][nj] == opp) {
						count++;
					}else if(m[ni][nj] == me) {
						flag = true;
						break;
					}else{
						break;
					}
					ni += di;
					nj += dj;
				}
				if (count > 0 && flag) {
					ni = si + di;
					nj = sj + dj;
					while(0 <= ni && ni < 8 && 0 <= nj && nj < 8) {
						if (m[ni][nj] == opp) {
							m[ni][nj] = me;
						}else{
							break;
						}
						ni += di;
						nj += dj;
					}
				}
			}
		}
	}

}