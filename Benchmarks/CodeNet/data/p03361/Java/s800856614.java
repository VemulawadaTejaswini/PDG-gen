import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		
		char[][] s = new char[H + 2][W + 2];
		String[] x = new String[H + 1];
		
		for(int i = 1; i < H + 1; i++) {
			x[i] = sc.next();
		}
		
		for(int i = 1; i < H + 1; i++) {
			for(int j = 1; j < W + 1; j++) {
				s[i][j] = x[i].charAt(j - 1);		
			}
		}
		
		int check = 0;
		
		loop:
		for(int i = 1; i < H + 1; i++) {
			for(int j = 1; j < W + 1; j++) {
				if(s[i][j] == '#') {
					if(s[i - 1][j] != '#' && s[i][j - 1] != '#' && s[i + 1][j] != '#' && s[i][j + 1] != '#') {
						check++;
						break loop;
					}
				}
			}
		}
		if(check > 0) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
	}
}
