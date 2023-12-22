
import java.util.Scanner;

public class Main {
	
	static boolean[][] visited;
	static int[][] island;
	static int cnt = 0;
	static int h,w;
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			while(true) {
				int w = sc.nextInt();
				int h = sc.nextInt();
				if(h == 0 && w == 0)	break;
				island = new int[h][w];
				visited = new boolean[h][w];
				
				for(int i=0;i<h;i++) {
					for(int j=0; j<w; j++) {
						island[i][j] = sc.nextInt();	
					}
	            }
                cnt = 0;
				for(int i=0;i<h;i++) {
					for(int j=0; j<w; j++) {
						if(island[i][j] == 1)
						visit(i,j);
						cnt++;
					}
				}
				
				System.out.println(cnt);
				}

			
			
		}
	}
	static void visit(int m,int n) {
		if(!visited[m][n]) {
            visited[m][n] = true;
            
			if(n+1 < w && island[m][n+1] == 1) {
				visit(m,n+1);
			}if(n-1 >= 0 && island[m][n-1] == 1) {
				visit(m,n-1);
			}if(m+1 < h && island[m+1][n] == 1) {
				visit(m+1,n);
			}if(m-1 >= 0 && island[m-1][n] == 1) {
				visit(m-1,n);
			}if(m+1 < h && n+1 < w && island[m+1][n+1] == 1) {
				visit(m+1,n+1);
			}if(m+1 < h && n-1 >= 0 && island[m+1][n-1] == 1) {
				visit(m+1,n-1);
			}if(m-1 >= 0 && n+1 < w && island[m-1][n+1] == 1) {
				visit(m-1,n+1);
			}if(m-1 >= 0 && n-1 >= 0 && island[m-1][n-1] == 1) {
				visit(m-1,n-1);
			}
		}
		
		return;
	}
}



