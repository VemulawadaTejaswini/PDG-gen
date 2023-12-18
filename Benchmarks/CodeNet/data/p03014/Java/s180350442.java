import java.util.Scanner;

public class Main {
	static int H;
	static int W;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		H = sc.nextInt();
		W = sc.nextInt();
		String[] S = new String[H];
		int[][][] num = new int[H][W][2];
		
		for(int i = 0; i < H; i++) {
			S[i] = sc.next();
		}
		
		int ans = 0;
		
		for(int i = 0; i < H; i++) {
			for(int j = 0; j < W; j++) {
				if(S[i].charAt(j) == '.') {
					int temp = Lamp(i, j, S, num);
					ans = Math.max(ans, temp);
				}
			}
		}
		System.out.println(ans);
	}
	
	public static int Lamp(int a, int b, String[] S, int[][][] num) {
		if(b > 0 && S[a].charAt(b - 1) == '.') {
			num[a][b][0] = num[a][b - 1][0];
		} else {
			for(int i = b; i >= 0; i--) {
				if(S[a].charAt(i) == '.') {
					num[a][b][0]++;
				} else {
					break;
				}
			}
			
			for(int i = b + 1; i < W; i++) {
				if(S[a].charAt(i) == '.') {
					num[a][b][0]++;
				} else {
					break;
				}
			}
		}
		
		if(a > 0 && S[a - 1].charAt(b) == '.') {
			num[a][b][1] = num[a - 1][b][1];
		} else {
			for(int i = a; i >= 0; i--) {
				if(S[i].charAt(b) == '.') {
					num[a][b][1]++;
				} else {
					break;
				}
			}
			
			for(int i = a + 1; i < H; i++) {
				if(S[i].charAt(b) == '.') {
					num[a][b][1]++;
				} else {
					break;
				}
			}
		}
		
		return num[a][b][0] + num[a][b][1] - 1;
	}
}
