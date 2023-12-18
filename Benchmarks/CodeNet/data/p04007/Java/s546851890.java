import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		char[][] red= new char[h][w];
		char[][] blue = new char[h][w];
		int minI = 1000;
		int maxI = 0;
		int minJ = 1000;
		int maxJ = 0;
		char[][] grid = new char[h][w];
		for(int i=0;i<h;i++) {
			String s = sc.next();
			for(int j=0;j<w;j++) {
				char temp= s.charAt(j);
				if(temp=='#') {
					minI = Math.min(minI,i);
					maxI = Math.max(maxI,i);
					minJ = Math.min(minJ,j);
					maxJ = Math.max(maxJ,j);
					
				}
				grid[i][j] = temp;
			}
		}
		for(int i=0;i<h;i++) {
			for(int j=0;j<w;j++) {
				blue[i][j] = '.';
				red[i][j] = '.';
				if(i>=minI && i<=maxI && j>=minJ && j<=maxJ) {
					red[i][j] = '#';
				}
				else {
					blue[i][j] = '#';
				}
				if(grid[i][j] == '#') {
					blue[i][j] = '#';
					red[i][j] = '#';
				}
			}
		}
		for(int i=0;i<h;i++) {
			for(int j=0;j<w;j++) {
				System.out.print(red[i][j]);
			}
			System.out.println();
		}
		for(int i=0;i<h;i++) {
			for(int j=0;j<w;j++) {
				System.out.print(blue[i][j]);
			}
			System.out.println();
		}
	}
}
