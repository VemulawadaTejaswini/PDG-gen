import java.io.PrintStream;
import java.util.Scanner;

 class Main {
	static Scanner sc = new Scanner(System.in);
	static PrintStream so = System.out;
	public static void main(String[] args) throws InterruptedException {
		int h = sc.nextInt();
		int w = sc.nextInt();
		int[][] s = new int[h+2][w+2];
		for (int i = 1; i <= h; i++) {
			String line = sc.next();
			for (int j = 1; j <= w; j++) {
				s[i][j] = line.charAt(j-1) == '.' ? 0 : -1;
			}
		}
		
		int[] mx = {1, 0, -1, 0, 1, 1, -1, -1};
		int[] my = {0, 1, 0, -1, -1, 1, -1, 1};
		
		for (int i = 1; i <= h; i++) {
			for (int j = 1; j <= w; j++) {
				if (s[i][j] == -1) {
					for (int m = 0; m < 8; m++) {
						if (s[i+mx[m]][j+my[m]] != -1) {
							s[i+mx[m]][j+my[m]] += 1;
						}
					}
				}
			}
		}
		
		for (int i = 1; i <= h; i++) {
			for (int j = 1; j <= w; j++) {
				so.print(s[i][j] == -1 ? "#" : s[i][j]);
			}
			so.println();
		}
	}
}
