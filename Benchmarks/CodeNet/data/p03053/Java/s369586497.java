 import java.util.Arrays;
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
	
	void run() {
		int h = sc.nextInt();
		int w = sc.nextInt();
		
		int ch[][] = new int[h+2][w+2];
		
		
		Arrays.fill(ch[0], -1);
		Arrays.fill(ch[h+1], -1);

		for(int i = 1; i <= h ; i++) {
			String str = sc.next();
			Arrays.fill(ch[i],-1);
			for(int j = 1; j <= w; j++) {
				if(str.charAt(j-1) == '#') {
					ch[i][j] = 0;
				}
			}
		}
		
	
		int u[][] = new int[h+2][w+2];
		int d[][] = new int[h+2][w+2];

		int r[][] = new int[h+2][w+2];
		int l[][] = new int[h+2][w+2];
		
		for(int i = 1; i <= h ; i++) {
			for(int j = 1 ; j <= w; j++) {				
				if(ch[i][j] == 0) {
					u[i][j] = 1;
				}else if(u[i-1][j] != 0){
					u[i][j] = u[i-1][j]+1;
				}
			}
		}

		for(int i = 1; i <= h ; i++) {
			for(int j = 1 ; j <= w; j++) {				
				if(ch[h-i+1][j] == 0) {
					d[h-i+1][j] = 1;
				}else if(d[h-i+2][j] != 0){
					d[h-i+1][j] = d[h-i+2][j]+1;
				}
			}
		}
		
		int ud[][] = new int[h+2][w+2];
		
		Arrays.fill(ud[0],Integer.MAX_VALUE/2);
		Arrays.fill(ud[h+1],Integer.MAX_VALUE/2);
		for(int i = 1 ; i <= h; i++ ) {
			ud[i][0] = Integer.MAX_VALUE/2;
			ud[i][w+1] = Integer.MAX_VALUE/2;
			for(int j = 1; j<=w;j++) {
				int min = Integer.MAX_VALUE/2;
				if(u[i][j] !=0 ) {
					min = Math.min(u[i][j], min);
				}
				if(d[i][j] != 0) {
					min = Math.min(d[i][j], min);
				}
				ud[i][j] = min -1;
			}
		}

		Arrays.fill(l[0],Integer.MAX_VALUE/2);
		Arrays.fill(l[h+1],Integer.MAX_VALUE/2);

		for(int i = 1; i <= h ; i++) {
			l[i][0] = Integer.MAX_VALUE/2;
			l[i][w+1] = Integer.MAX_VALUE/2;

			for(int j = 1 ; j <= w; j++) {
				l[i][j] = Math.min(ud[i][j], l[i][j-1]+1);
			}
		}
		
		Arrays.fill(r[0],Integer.MAX_VALUE/2);
		Arrays.fill(r[h+1],Integer.MAX_VALUE/2);
		for(int i = 1; i <= h ; i++) {
			r[i][0] = Integer.MAX_VALUE/2;
			r[i][w+1] = Integer.MAX_VALUE/2;
			for(int j = 1 ; j <= w; j++) {
				r[i][w-j+1] = Math.min(ud[i][w-j+1], r[i][w-j+2]+1);
			}
		}
		
		int lr[][] = new int[h+2][w+2];
		
		int max = 0;
		for(int i = 1; i <= h ; i++) {
			for(int j =1 ; j <= w;j++) {
				int min = Integer.MAX_VALUE/2;
				min = Math.min(min, l[i][j]);
				min = Math.min(min, r[i][j]);
				lr[i][j] = min;
				max = Math.max(min,max);
			}
		}
		System.out.println(max);
	}
}
