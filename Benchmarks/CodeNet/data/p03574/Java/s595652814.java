
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		
		String board [][] = new String [H+1][W+1];
		
		for (int i=0; i<H; i++) {
			String S = sc.next();
			board [i] = S.split("");
		}
		
		
		
		int dx [] = new int [] {1, 0, -1, 0, 1, -1, -1, 1};
		int dy [] = new int [] {0, 1, 0, -1, 1, 1, -1, -1};
		
		
		for (int i = 0; i < H; i++) {
			
			for (int j = 0; j < W; j++) {
				if (board[i][j].equals("#")){
					System.out.print('#');
					continue;
				}
			
				int num = 0;
				for (int d = 0; d < 8; d++) {
					int ni = i + dx[d];
					int nj = j + dy[d];
			
					if (ni<0 || H<=ni)
						continue;
					
					if (nj<0 || W<=nj)
						continue;
					
					if (board[ni][nj].equals("#"))
						num++;
				}
				
				//System.out.println(i+ " : " + j+ " : " + num);
				System.out.print(num);
			
			}
			System.out.println();
		}
		
		sc.close();
	}
}
