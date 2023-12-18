import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 入力
		int H = sc.nextInt();                
		int W = sc.nextInt();                
		
		int[][] s = new int[H][W];
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				String str = sc.next(); 
//				s[i][j] = sc.nextInt();
				s[i][j] = str.equals(".") ? 0 : 1;
//				System.out.println(i+"行目"+j+"列目"+s[i][j]);			
			}
		}
		
		boolean ans = false;
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				if (s[i][j] == 1) {
					if (i == 0) {
						if (j == 0) {
							if (!(s[i+1][j] == 1 && s[i][j+1] == 1)) {
								ans = true;
							}													
						} else if (j == W-1) {
							if (!(s[i+1][j] == 1 && s[i][j-1] == 1)) {
								ans = true;
							}
						}
					} else if (i == H-1) {
						if (j == 0) {
							if (!(s[i-1][j] == 1 && s[i][j+1] == 1)) {
								ans = true;
							}													
						} else if (j == W-1) {
							if (!(s[i-1][j] == 1 && s[i][j-1] == 1)) {
								ans = true;
							}
						}
					} else {
						if (!(s[i-1][j] == 1 && s[i+1][j] == 1 
								&& s[i][j-1] == 1 && s[i][j+1] == 1)) {
							ans = true;
						}						
					}
				}
			}
		}
		if(!ans){
			System.out.println("No");			
		} else {
			System.out.println("Yes");			
		}
	}	
}
