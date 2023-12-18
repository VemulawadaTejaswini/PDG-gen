import java.util.Scanner;

public class Main{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		
		char c[][] = new char[h+2][w+2];
		
		for(int i = 0; i < w + 2; i ++) {
			c[0][i] = 'a'; 
		}
		for(int i = 0; i < w + 2; i ++) {
			c[h+1][i] = 'a';
		}
		for(int i = 0; i < h + 2; i ++) {
			c[i][0] = 'a';
		}
		for(int i = 0; i < h + 2; i ++) {
			c[i][w+1] = 'a';
		}
		
		
		for(int i = 1; i < h; i ++) {
			String s = sc.next();
			char sChar [] = s.toCharArray();
			for(int j = 1; j < w; j ++) {
				c[i][j] = sChar[j];	
			}
		}
		
		for(int i = 0; i < h; i ++) {
			for(int j = 0; j < w; j ++) {
				if(c[i][j] == '#') {
					if(c[i-1][j] != '#' && c[i+1][j] != '#' && c[i][j-1] != '#' && c[i][j+1] !='#') {
						System.out.println("No");
						return;
					}
				}
			}
			
		}
		
		System.out.println("Yes");
	}
}
