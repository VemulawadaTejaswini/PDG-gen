
import java.util.Scanner;

public class Main {
	public static int l = 5;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, m, t, p;
		int dir,col;
		int[][] times;
		l=32;
		while (true) {
			n = sc.nextInt();
			if (n == 0) {
				break;
			}

			m = sc.nextInt();
			t = sc.nextInt();
			p = sc.nextInt();
			
			// times initialize
			times = new int[l][l];
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < m; j++) {
					times[i][j] = 1;
				}
			}
			
			//turn
			for(int i = 0; i < t; i++) {
				dir = sc.nextInt();
				col = sc.nextInt();
				times = turn(times,dir,col);
			}
			
			//system out
			for(int i=0;i<p;i++) {
				System.out.println(times[sc.nextInt()][sc.nextInt()]);		
			}
		}
		sc.close();
	}

	public static int[][] turn(int[][] times, int dir, int col) {
		int[][] temp = new int[l][l];
		if(dir == 1) {
			int jmax = 0;
			for(int j = 0; j < l; j++) {
				if(times[0][j] > 0) {
					jmax++;
				}else {break;}
			}
			for(int i=0; i<l-col;i++) {
				for(int j=0; j<jmax; j++) {
					temp[i][j] = times[i+col][j];
				}
			}
			for(int i=0;i<col;i++) {
				for(int j=0; j<jmax; j++) {
					temp[i][j] += times[col-1-i][j];
				}
			}
		}else {
			int imax = 0;
			for(int i = 0; i < l; i++) {
				if(times[i][0] > 0) {
					imax++;
				}else {break;}
			}
			for(int j=0;j<l-col;j++) {
				for(int i=0;i<imax;i++) {
					temp[i][j] = times[i][j+col];
				}
			}
			for(int j=0;j<col;j++) {
				for(int i=0;i<imax;i++) {
					temp[i][j] += times[i][col-1-j];
				}
			}
			
		}
		return temp;
	}

}

