import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int H = Integer.parseInt(sc.next());
		int W = Integer.parseInt(sc.next());
		String s[][] = new String[H][W];
		for(int i = 0; i < H; i++) {
			String temp = sc.next();
			for(int j = 0; j < W; j++) {
				s[i][j] = temp.substring(j, j + 1);
			}
		}
		
		//boolean flag = true;
		int dx[] = {-1, 1, 0, 0};
		int dy[] = {0, 0, 1, -1};
		for(int i = 0; i < H; i++) {
			outside : for(int j = 0; j < W; j++) {
				if(s[i][j].equals("#")) {
					boolean tempFlag = false;
					inside : for(int k = 0; k < 4; k++) {
						if(i == 0 && k == 3) continue inside;
						if(i == H - 1 && k == 2) continue inside;
						if(j == 0 && k == 0) continue inside;
						if(j == W - 1 && k == 1) continue inside;
						if(s[i + dy[k]][j + dx[k]].equals("#")) {
							tempFlag = true;
							continue outside;
						}
					}
					if(!tempFlag) {
						System.out.println("No");
						return;
					}
				}
			}
		}
		System.out.println("Yes");
	}
}
