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
				if (c[i+1][j] =='#') {
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
				if (c[i+1][j] =='.') {
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
}
