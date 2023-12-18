import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int right = 0;
		while (s.startsWith("F")) {
			s = s.substring(1);
			right++;
		}
		x -= right;
		ArrayList<Integer> RorL = new ArrayList<>();
		ArrayList<Integer> UorD = new ArrayList<>();
		boolean isRorL = true;
		int count = 0;
		s+="T";
		for (char c : s.toCharArray()) {
			if (c == 'T') {
				if (isRorL) {
					if(count!=0) {
						RorL.add(count);
					}
				} else {
					if(count!=0) {
						UorD.add(count);
					}
				}
				count = 0;
				isRorL = !isRorL;
			} else {
				count++;
			}
		}
		x += 8050;
		y += 8050;
		//テーブル構築//dp[i][j]でi回目の操作で座標軸上のn+8050に居られるかどうか
		boolean xdp[][] = new boolean[RorL.size() + 1][16100];
		boolean ydp[][] = new boolean[UorD.size() + 1][16100];
		//dp初期条件
		xdp[0][8050] = true;
		ydp[0][8050] = true;
		//dp
		for (int i = 0; i < RorL.size(); i++) {
			for (int j = 0; j < 16100; j++) {
				if (xdp[i][j]) {
					//System.out.println(String.format("i=%d j=%d", i,j));
					xdp[i+1][j - RorL.get(i)] = true;
					xdp[i+1][j + RorL.get(i)] = true;
				}
			}
		}
		for (int i = 0; i < UorD.size(); i++) {
			for (int j = 0; j < 16100; j++) {
				if (ydp[i][j]) {
					ydp[i+1][j - UorD.get(i)] = true;
					ydp[i+1][j + UorD.get(i)] = true;
				}
			}
		}
		if(xdp[RorL.size()][x] && ydp[UorD.size()][y]) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}