import java.util.Scanner;

public class Main {
	
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int w = sc.nextInt();
		int[][] a = new int[h+2][w+2];
		String s;
		boolean flag = true;
		int x = 1;
		int y = 1;
		
		for (int i=1; i<=h; i++) {
			s = sc.next();
			for (int j=1; j<=w; j++) {
				if (s.charAt(j-1) == '#') {
					a[i][j] = 1;
				} else {
					a[i][j] = 0;
				}
			}
		}
		
		while (flag) {
			if (a[x][y+1] == 1) {
				if (a[x+1][y] == 1) {
					flag = false;
				}
				y++;
			} else {
				if (a[x+1][y] == 1) {
					x++;
				} else {
					flag = false;
				}
			}
			
			if (x == h && y == w && flag) {
				break;
			}
		}
		
		System.out.println(flag ? "Possible" : "Impossible");
	}
}