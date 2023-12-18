
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		boolean[][] masu = new boolean[H][W];
		for(int i = 0; i < H; i++) {
			char[] tmp = sc.next().toCharArray();
			for(int j = 0; j < W; j++) {
				if(tmp[j] == '#') {
					masu[i][j] = true;
				} else {
					masu[i][j] = false;
				}
			}
		}
		boolean flag = true;
		int count = 0;
		while(flag) {
			flag = false;
			for(int i = 0; i < H; i++) {
				for(int j = 0; j < W; j++) {
					if(masu[i][j] == false) {
						flag = true;
					}
				}
			}
			if(flag == false) {
				break;
			}
			boolean[][] after = new boolean[H][W];
			for(int i = 0; i < H; i++) {
				for(int j = 0; j < W; j++) {
					after[i][j] = false;
				}
			}
			for(int i = 0; i < H; i++) {
				for(int j = 0; j < W; j++) {
					if(masu[i][j] == true) {
						after[i][j] = true;
						if(0 < i) {
							after[i - 1][j] = true;
						}
						if(i < H - 1) {
							after[i + 1][j] = true;
						}
						if(0 < j) {
							after[i][j - 1] = true;
						}
						if(j < W - 1) {
							after[i][j + 1] = true;
						}
					}
				}
			}
			masu = after;
			count++;
		}
		System.out.println(count);
	}

}
