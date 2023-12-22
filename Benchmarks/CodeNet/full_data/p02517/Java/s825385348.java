
import java.util.*;
public class Main {
	Scanner sc;
    void run() {
        sc = new Scanner(System.in);
        while (true) {
        	int r = sc.nextInt();
        	int c = sc.nextInt();
        	int q = sc.nextInt();
        	if (r==0&&c==0&&q==0) break;
        	int[][] grid = new int[r][c];
        	SubG[] subg = new SubG[q];
        	for (int i=0;i<r; i++) for (int j=0;j<c;j++) grid[i][j] = sc.nextInt();
        	for (int i=0;i<q;i++) subg[i] = new SubG( sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt() );
        	for (int i=0;i<q;i++) {
        		int min = 10000;
        		for (int j=subg[i].x1;j<=subg[i].x2;j++) {
        			for (int k=subg[i].y1;k<=subg[i].y2;k++) {
        				min = (min < grid[j][k])? min:grid[j][k];
        			}
        		}
        		System.out.println(min);
        	}
		}
    }

    public static void main(String[] args) {
        new Main().run();
    }
	
	class SubG {
		int x1,x2,y1,y2;
		SubG(int x1, int y1, int x2, int y2) {
			this.x1 = x1;
			this.x2 = x2;
			this.y1 = y1;
			this.y2 = y2;
		}
	}
}