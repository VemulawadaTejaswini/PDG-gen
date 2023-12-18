import java.util.Arrays;
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int W = sc.nextInt(), H = sc.nextInt(), N = sc.nextInt();
		int[][] map = new int[W][H];
		for(int i = 0; i < W; i++) Arrays.fill(map[i], 0);
		for(int i = 0; i < N; i++) {
			int x = sc.nextInt(), y = sc.nextInt(), a = sc.nextInt();
			if(a == 1) {
				for(int j = 0; j < x; j++) {
					for(int k = 0; k < H; k++) map[j][k] = -1;
				}
			}else if(a == 2) {
				for(int j = x; j < W; j++) {
					for(int k = 0; k < H; k++) map[j][k] = -1;
				}
			}else if(a == 3) {
				for(int j = 0; j < W; j++) {
					for(int k = 0; k < y; k++) map[j][k] = -1;
				}
			}else {
				for(int j = 0; j < W; j++) {
					for(int k = y; k < H; k++) map[j][k] = -1;
				}
			}
		}
		int cnt = 0;
		for(int i = 0; i < H; i++) {
			for(int j = 0; j < W; j++) {
				if(map[j][i] == 0) cnt++;
			}
		}
		System.out.println(cnt);
	}
}