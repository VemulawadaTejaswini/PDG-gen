

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();
		int w = sc.nextInt();
		int d = sc.nextInt();

//		int a[][] = new int[h][w];
		int x[] = new int[h*w + 1];
		int y[] = new int[h*w + 1];
		for(int i = 0; i < h; i++){
			for(int j = 0; j < w; j++){
				int num = sc.nextInt();

				x[num] = j;
				y[num] = i;
//				a[i][j] = sc.nextInt();
			}
		}

//		int matrix[][] = new int[h*w][h*w];
		long costFromStart[] = new long[h*w + 1];

		for(int i = 1; i <= h*w ; i++){
			if(i <= d){
				costFromStart[i] = 0;
			}
			else{
				costFromStart[i] = costFromStart[i - d] + Math.abs(x[i] - x[i - d]) + Math.abs(y[i] - y[i - d]);
			}
		}

		int q = sc.nextInt();
		for(int i = 0; i < q; i++){
			int l = sc.nextInt();
			int r = sc.nextInt();

			System.out.println(costFromStart[r] - costFromStart[l]);
		}
	}

}
