
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int[][] masu = new int[H][W];
		for(int i = 0; i < H; i++) {
			char[] tmp = sc.next().toCharArray();
			for(int j = 0; j < W; j++) {
				if(tmp[j] == '#') {
					masu[i][j] = 1;
				} else {
					masu[i][j] = 0;
				}
			}
		}
		boolean flag = true;
		int count = 0;
		while(flag) {
			flag = false;
			for(int i = 0; i < H; i++) {
				for(int j = 0; j < W; j++) {
					if(masu[i][j] == 0) {
						flag = true;
					}
				}
			}
			if(flag == false) {
				break;
			}
			int[][] after = new int[H][W];
			for(int i = 0; i < H; i++) {
				for(int j = 0; j < W; j++) {
					after[i][j] = 0;
				}
			}
			for(int i = 0; i < H; i++) {
				for(int j = 0; j < W; j++) {
					if(masu[i][j] == 1) {
						after[i][j] = -1;
						if(0 < i && after[i - 1][j] != -1) {
							after[i - 1][j] = 1;
						}
						if(i < H - 1 && after[i + 1][j] != -1) {
							after[i + 1][j] = 1;
						}
						if(0 < j && after[i][j - 1] != -1) {
							after[i][j - 1] = 1;
						}
						if(j < W - 1 && after[i][j + 1] != -1) {
							after[i][j + 1] = 1;
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
