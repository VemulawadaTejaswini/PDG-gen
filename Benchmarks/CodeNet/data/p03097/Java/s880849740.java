
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
	
	void run() {
		int n = sc.nextInt();

		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int target  = a^b;
		
		int bc = Integer.bitCount(target);
		if(bc % 2 ==0 ) {
			System.out.println("NO");
			return;
		}
		
		System.out.println("YES");
		
		System.out.print(a);
		
		int[][] xx = new int[n][2];
		for(int i = 0 ; i < n; i++) {
			xx[i][0] = (target>>i)%2;
			xx[i][1] = i;					
		}
		Arrays.sort(xx, (x1,x2) -> x1[0]-x2[1]);

		int g[] = new int[n];

		for(int i = 0 ; i < (1 << n) -1; i++) {			
			int x = Integer.numberOfTrailingZeros(Integer.lowestOneBit(i));
			if(x == 32) {
				x=0;
			}
			
			for(int j = 1 ; j <= bc/2; j++) {
				int jj = 1<<(j*2);
				if(jj <= (1<<n)-i) {
					x = x ^ 1;
				}
			}
			int y = xx[x][1];
			g[x] = 1-g[y];
			
			
			int r = 0;
			for(int k = 0; k < n; k++) {
				r*=2;
				r+=g[k];
			}
			System.out.print(" "+(r^a));
		}
	}
	
	
	
}
