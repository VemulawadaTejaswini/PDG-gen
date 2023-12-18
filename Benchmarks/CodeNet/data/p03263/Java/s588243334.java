

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int H = scanner.nextInt();
		int W = scanner.nextInt();
		int[][] a = new int[H][W];
		
		int N = 0;
		
		int[][] output = new int[H*W][4];
		
		for(int i=0; i<H; i++) {
			for(int j=0; j<W; j++) {
				a[i][j] = scanner.nextInt();
			}
		}
		
		for(int i=0; i<H; i++) {
			
			if(i % 2 == 0) {
				for(int j=0; j<W-1; j++) {
					if(a[i][j] % 2 == 1) {
						a[i][j] -= 1;
						a[i][j+1] += 1;
						output[N][0] = i+1;
						output[N][1] = j+1;
						output[N][2] = i+1;
						output[N][3] = j+1+1;
						N += 1;
					}
				}
				int j = W-1;
				if((a[i][j] % 2 == 1) && i!=H-1) {
					a[i][j] -= 1;
					a[i+1][j] += 1;
					output[N][0] = i+1;
					output[N][1] = j+1;
					output[N][2] = i+1+1;
					output[N][3] = j+1;
					N += 1;
				}
								
			} else if(i % 2 == 1) {
				for(int j=W-1; j>0; j--) {
					if(a[i][j] % 2 == 1) {
						a[i][j] -= 1;
						a[i][j-1] += 1;
						output[N][0] = i+1;
						output[N][1] = j+1;
						output[N][2] = i+1;
						output[N][3] = j-1+1;
						N += 1;
					}
				}
				int j = 0;
				if((a[i][j] % 2 == 1) && i!=H-1) {
					a[i][j] -= 1;
					a[i+1][j] += 1;
					output[N][0] = i+1;
					output[N][1] = j+1;
					output[N][2] = i+1+1;
					output[N][3] = j+1;
					N += 1;
				}				
			}
		}
		
		System.out.println(N);
		for(int i=0; i<N; i++) {
			for(int k=0; k<4; k++) {
				System.out.print(output[i][k]);
				System.out.print(" ");
			}
			System.out.println("");
		}
		
	}

}
