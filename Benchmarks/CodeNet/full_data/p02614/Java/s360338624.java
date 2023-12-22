import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int k = sc.nextInt();
		
		char[][] c = new char[h][w];
		Arrays.setAll(c, i -> sc.next().toCharArray());
		
		int cnt = 0;
		
		for (int maskR = 0; maskR < 1 << h; maskR++) {
			for (int maskC = 0; maskC < 1 << w; maskC++) {
				int black = 0;
				
				for (int i = 0; i < h; i++) {
					for (int j = 0; j < w; j++) {
						if (((maskR >> i) & 1) == 0 && ((maskC >> j) & 1) == 0
								&& c[i][j] == '#')
							black++;
					}
				}
				
				if (black == k) cnt++;
			}
		}
		System.out.println(cnt);
		
		sc.close();
	}
	
}

