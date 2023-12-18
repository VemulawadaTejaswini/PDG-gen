import java.util.Scanner;

public class Main {
	static int H, W;
	static char[][] s;
	
	static boolean check(int i, int j) {
		if(i + 1 < H && s[i + 1][j] == '#') return true;
		if(j + 1 < W  && s[i][j + 1] == '#') return true;
		if(0 < i - 1 && s[i - 1][j] == '#') return true;
		if(0 < j - 1&& s[i][j - 1] == '#') return true;
		
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		H = sc.nextInt();
		W = sc.nextInt();
		s = new char[H][W];
		for (int i = 0; i < H; i++) {
			s[i] = sc.next().toCharArray();
		}
		
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				if(s[i][j] == '.') continue;
				if(s[i][j] == '#') {
					if(!check(i, j)) {
						System.out.println("No");
						return;
					}
				}
			}
		}
		
		System.out.println("Yes");
	}
}