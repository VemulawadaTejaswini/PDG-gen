import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner stdIn = new Scanner(System.in);
		int H = stdIn.nextInt();
		int W = stdIn.nextInt();
		int K = stdIn.nextInt();
		char[][] c = new char[H][W];
		ArrayList<String> s = new ArrayList<String>();
		
		for(int i = 0; i < H; i ++) {
			s.add(stdIn.next());
		}
		
		for(int i = 0; i < H; i ++) {
			for(int j = 0; j < W; j ++) {
				c[i][j] = s.get(i).toCharArray()[j];
			}
		}
		
		int h = (int) Math.pow(2, H) - 1;
		int w = (int) Math.pow(2, W) - 1;
		
		int ans = 0;
		
		for(int i = h; 0 <= i; i --) {
			String hBin = String.format("%" + H + "s", Integer.toBinaryString(i)).replace(" ", "0");
			for(int j = w; 0 <= j; j --) {
				String wBin = String.format("%" + W + "s", Integer.toBinaryString(j)).replace(" ", "0");
				int blackCnt = 0;
				for(int hcnt = 0; hcnt < H; hcnt ++) {
					for(int wcnt = 0; wcnt < W; wcnt ++) {
						if(hBin.substring(hcnt, hcnt + 1).equals("0") && wBin.substring(wcnt, wcnt + 1).equals("0")) {
							if(c[hcnt][wcnt] == '#') {
								blackCnt ++;
							}
						}
					}
				}
				if(blackCnt == K) {
					ans ++;
				}
			}
		}
		
		System.out.println(ans);
		
	}
}
