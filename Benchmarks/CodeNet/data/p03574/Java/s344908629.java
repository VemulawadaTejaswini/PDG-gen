import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int h = scanner.nextInt();
		int w = scanner.nextInt();
		
		char[][] mines = new char[h+2][w+2];
		char[][] ans = new char[h][w];
		
		//fill
		for (int i = 0; i < h+2; i++) {
			for (int j = 0; j < w+2; j++) {
				mines[i][j] = '.';
			}
		}
		
		// input
		for (int i = 0; i < h; i++) {
			String s = scanner.next();
			char[] c = s.toCharArray();
			for (int j = 0; j < c.length; j++) {
				if (c[j]=='#') {
					mines[i+1][j+1] = '#';
				}else{
					mines[i+1][j+1] = '.';
				}
			}
		}
		
		for (int i = 1; i < h+1; i++) {
			for (int j = 1; j < w+1; j++) {
				if (mines[i][j]=='#') {
					ans[i-1][j-1] = '#';
				}else{
					int count = 0;
					for (int k = i-1; k <= i+1; k++) {
						for (int k2 = j-1; k2 <= j+1; k2++) {
							if (i==k && j==k2) {
								continue;
							}else{
								if (mines[k][k2]=='#') {
									count++;
								}
							}
						}
					}
					String s = String.valueOf(count);
					ans[i-1][j-1] = s.charAt(0);
				}
			}
		}

		for (int i = 0; i < h; i++) {
			String output = new String(ans[i]);
			System.out.println(output);
		}
		
		scanner.close();
	}

}