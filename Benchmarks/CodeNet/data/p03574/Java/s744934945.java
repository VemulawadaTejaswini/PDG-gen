import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		
		String[] str = new String[H];
		String[][] S = new String[H][W];
		
		for(int i = 0; i < H; i++) {
			str[i] = sc.next();
		}
		
		for(int i = 0; i < H; i++) {
			for(int j = 0; j < W; j++) {
				String[] s = str[i].split("");
				S[i][j] = s[j];
			}
		}
		
		for(int i = 0; i < H; i++) {
			for(int j = 0; j < W; j++) {
				if(S[i][j].equals("#")) {
					System.out.print("#");
				} else {
					System.out.print(bom(i, j, S));
				}
			}
			System.out.println();
		}
	}
	
	public static int bom(int a, int b, String[][] S) {
		int count = 0;
		for(int i = a - 1; i <= a + 1; i++) {
			if(i < 0 || i >= S.length) {
				continue;
			}
			for(int j = b - 1; j <= b + 1; j++) {
				if(j < 0 || j >= S[0].length) {
					continue;
				}
				if(S[i][j].equals("#")) {
					count++;
				}
			}
		}
		return count;
	}
}
