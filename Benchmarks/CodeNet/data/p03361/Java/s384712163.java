import java.util.Scanner;

public class Main{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		boolean che = true;
		
		char c[][] = new char[h][w];
		
		for(int i = 0; i < h; i ++) {
			String s = sc.next();
			char sChar [] = s.toCharArray();
			for(int j = 0; j < w; j ++) {
				c[i][j] = sChar[j];	
			}
		}
		
		
		
		for(int i = 0; i < h; i ++) {
			for(int j = 0; j < w; j ++) {
				if(c[i][j] == '#') {
					che = cheak(c,i,j,h,w);
					if(che == false) {
						System.out.println("No");
						return;
					}
				}
			}
		}
		System.out.println("Yes");
	}
	
	public static boolean cheak(char c[][],int i, int j, int h, int w) {
		int x[] = {0,1,-1,0};
		int y[] = {1,0,0,-1};
		for(int k = 0; k < 4; k ++) {
			if(i + x[k] <0 || i + x[k] == w || j + y[k] < 0 || j + y[k] == w) {
				continue;
				
			}else if(c[i + x[k]][j + y[k]] == '#') {
				return true;
				
			}
		}
		return false;
	}
}