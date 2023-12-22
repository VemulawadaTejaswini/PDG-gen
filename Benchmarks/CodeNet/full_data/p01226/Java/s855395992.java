import java.util.Scanner;

public class Main {
	static int[] di = {0,-1,0,1};
	static int[] dj = {1,0,-1,0};
	static char[] tank = {'>','^','<','v'};
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			if (i > 0) {
				System.out.println();
			}
			solve();
		}
	}
	
	public static void solve() {
		int h = sc.nextInt();
		int w = sc.nextInt();
		char[][] m = new char[h][];
		for(int i=0;i<h;i++) {
			m[i] = sc.next().toCharArray();
		}
		int n = sc.nextInt();
		char[] c = sc.next().toCharArray();
		int ni = -1,nj = -1;
		int dir = -1;
		for(int i=0;i<h;i++) {
			for(int j=0;j<w;j++) {
				char cc = m[i][j];
				if (cc == '^' || cc == 'v' || cc == '<' || cc == '>') {
					switch (cc) {
					case '^':
						dir = 1;
						break;
					case '<':
						dir = 2;
						break;
					case 'v':
						dir = 3;
						break;
					case '>':
						dir = 0;
						break;
					}
					ni = i;
					nj = j;
					m[i][j] = '.';
				}
			}
		}
		for(int t=0;t<n;t++) {
			switch (c[t]) {
			case 'U':
				dir = 1;
				break;
			case 'D':
				dir = 3;
				break;
			case 'L':
				dir = 2;
				break;
			case 'R':
				dir = 0;
				break;
			}
			if (c[t] != 'S') {
				int xi = ni + di[dir];
				int xj = nj + dj[dir];
				if (xi < 0 || xi >= h || xj < 0 || xj >= w || m[xi][xj] != '.') {
					continue;
				}
				ni = xi;
				nj = xj;
			}else{
				int bi = ni;
				int bj = nj;
				while(0 <= bi && bi < h && 0 <= bj && bj < w) {
					if (m[bi][bj] == '*') {
						m[bi][bj] = '.';
						break;
					}else if(m[bi][bj] == '#') {
						break;
					}
					bi += di[dir];
					bj += dj[dir];
				}	
			}
		}
		m[ni][nj] = tank[dir];
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<h;i++) {
			sb.append(m[i]);
			sb.append('\n');
		}
		System.out.print(sb.toString());
	}
}