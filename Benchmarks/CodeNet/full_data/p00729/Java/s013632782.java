import java.util.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;
public class Main {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		while (read())
			solve();
	}
	
	static int N, M, R, Q;
	static Range2[] qs;
	static Range[][][] rs;
	static boolean read() {
		N = sc.nextInt(); M = sc.nextInt();
		if (N == 0 && M == 0) return false;
		
		rs = new Range[N + 1][M + 1][20]; // PC Student  
		for (int i = 0; i < N + 1; i++) {
			rs[i] = new Range[M + 1][20];
			for (int j = 0; j < M + 1; j++) {
				rs[i][j] = new Range[20];
				for (int k = 0; k < 20; k++) {
					rs[i][j][k] = new Range(-1, -1);
				}
					
			}
		}
				
		R = sc.nextInt();
		for (int i = 0; i < R; i++) {
			int t, n, m, s;
			t = sc.nextInt();
			n = sc.nextInt();
			m = sc.nextInt();
			s = sc.nextInt();
			if (s == 1) {
				for (int j = 0; j < 20; j++) {
					if (rs[n][m][j].start == -1) {
						rs[n][m][j].start = t;
						break;
					}
				}
			} else {
				for (int j = 0; j < 20; j++) {
					if (rs[n][m][j].end == -1) {
						rs[n][m][j].end = t;
						break;
					}
				}
			}
		}
		
		Q = sc.nextInt();
		qs = new Range2[Q];
		for (int i = 0; i < Q; i++) 
			qs[i] = new Range2(sc.nextInt(), sc.nextInt(), sc.nextInt());
		
		return true;
	}

	static void solve() {
		for (int i = 0; i < Q; i++) {
			int ans = 0;
			for (int t = qs[i].start; t < qs[i].end; t++) {
				boolean add = false;
				for (int j = 1; j <= N && !add; j++) {
					for (int k = 0; k < 20 && !add; k++) {
						if (rs[j][qs[i].student][k].start <= t && t < rs[j][qs[i].student][k].end) {
							ans++;
							add = true;
						}
					}
				}
			}	
			System.out.println(ans);
		}
	}	
}

class Range {
	int start, end;
	Range(int start, int end) {
		this.start = start;
		this.end = end;
	}
}

class Range2 {
	int start, end, student;
	Range2(int start, int end, int student) {
		this.start = start;
		this.end = end;
		this.student = student;
	}
}