import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int H, W, A, B;
		
		H = sc.nextInt();
		W = sc.nextInt();
		A = sc.nextInt();
		B = sc.nextInt();
		
		int[][] s = new int[H][W];
		
		int h = 0;
		int w = 0;
		
		for(int i=0; i < H; i++) {
			for(int j=0; j < A; j++) {
				s[h][w] = 1;
				w = (w+1)%W;
			}
			h += 1;
			w = (w+1-B+W)%W;
		}
		
		boolean OK = true;
		int tmp;
		
		for(int x=0; x < W; x++) {
			tmp = 0;
			for(int y=0; y < H; y++) {
				tmp += s[y][x];
			}
			if(Math.min(tmp, H-tmp) != B) {
				OK = false;
			}
			
		}
		
		if (OK == false) {
			System.out.println("No");
		} else {
			for(int i=0; i<H; i++) {
				for(int j=0; j<W; j++) {
					System.out.print(String.valueOf(s[i][j]));
				}
				System.out.println();
			}
			
			
		}
		
		sc.close();
	}
}