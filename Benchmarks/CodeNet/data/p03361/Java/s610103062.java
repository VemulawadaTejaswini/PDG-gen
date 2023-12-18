import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int h = scanner.nextInt();
		int w = scanner.nextInt();
		char[][] ary = new char[h][w];
		boolean flg = false;
		for(int n = 0; n < h; n++) {
			String tmp = scanner.next();
			for(int r = 0; r < w; r++) {
				ary[n][r] = tmp.charAt(r); 
			}
		}
		
		for(int s = 0; s < h; s++) {
			for(int t = 0; t < w; t++) {
				if(ary[s][t] == '#') {
					if(s != 0) {
						if(ary[s-1][t] == '#') continue;
					}
					if(t != 0) {
						if(ary[s][t-1] == '#') continue;
					}
					if(s != h-1) {
						if(ary[s+1][t] == '#') continue;
					}
					if(t != w-1) {
						if(ary[s][t+1] == '#') continue;
					}
				 
					flg = true;
				}
			}
			if(flg) break;
		}
		if(!flg) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}