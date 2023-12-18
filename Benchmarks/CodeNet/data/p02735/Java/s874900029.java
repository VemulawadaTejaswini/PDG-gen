import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String[] str = new String[100];
		char[][] c = new char[100][100];
		int h = sc.nextInt();
		int w = sc.nextInt();
		String tmp = sc.nextLine();
		for (int i=0; i<h; i++) {
			str[i] = sc.nextLine();
		}
		sc.close();
		for (int i=0; i<h; i++) {
			c[i] = str[i].toCharArray();
		}

		int ans = 0;
		boolean f = false;
		int i= 0;
		int j=0;
		while(true) {
			if (c[i][j]== '#') {
				if (!f) {
					ans++;
				}
				f = true;
				if (check(i, j, h, w, c, '.') == 1) {
					if (i<h-1) {
						i++;
					} else if (j<w-1) {
						j++;
					} else {
						break;
					}
				} else {
					if (j<w-1) {
						j++;
					} else if (i<h-1) {
						i++;
					} else {
						break;
					}
				}
			} else {
				f = false;
				if (check(i, j, h, w, c, '#') == 1) {
					if (i<h-1) {
						i++;
					} else if (j<w-1) {
						j++;
					} else {
						break;
					}
				} else {
					if (j<w-1) {
						j++;
					} else if (i<h-1) {
						i++;
					} else {
						break;
					}
				}
			}
		}

		System.out.println(ans);
	}
	static int check(int ii, int jj, int h, int w, char[][] c, char x) {
		// ans = 1 ; right
		// ans = 0 ; down
		if (ii==h-1) return 0;
		if (jj==w-1) return 1;
		int i;
		for (i=ii; i<h; i++) {
			if (c[i][jj] == x) break;
		}
		int k = i;
		int l = 0;
		for(int j=jj; j<w; j++) {
			for (i=ii; i<k; i++) {
				if (c[i][j] == x) break;
			}
			l = j;
		}
		int rightValue = k * l;

		int j;
		for (j=jj; j<w; j++) {
			if(c[ii][j] == x) break;
		}
		k= j;
		l = 0;
		for (i=ii;i<h; i++) {
			for (j=jj; j<k; j++) {
				if (c[i][j] ==x) break;
			}
			l = i;
		}
		int downValue = k * l;

		int ans = 0;
		if (rightValue >= downValue) {
			ans = 1;
		}
		return ans;
	}
}
