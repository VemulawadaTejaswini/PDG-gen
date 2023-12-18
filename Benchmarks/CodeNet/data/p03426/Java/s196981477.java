import java.util.ArrayList;
import java.util.Scanner;

class Main{

	public static void main(String[] args) {




		Scanner scan = new Scanner(System.in);
		int H = scan.nextInt();	
		int W = scan.nextInt();	
		int D = scan.nextInt();
		int[] x = new int[H*W+1];
		int[] y = new int[H*W+1];

		for(int i= 0;i < H;i++){
			for(int j= 0;j < W;j++){
				int tmp = scan.nextInt();
				x[tmp] = i;
				y[tmp] = j;
			}
		}
		int Q = scan.nextInt();	
		int[] L = new int[Q];
		int[] R = new int[Q];
		for(int i = 0;i < Q;i++){
			L[i] = scan.nextInt();
			R[i] = scan.nextInt();
		}

		int[] memo = new int[H*W+1];
		 for(int i = 0;i < Q;i++){
			 memo[i] = memo[i -D] + Math.abs(x[i] - x[i -D])+ Math.abs(y[i] - y[i-D]);
		 }
		 
		 for(int i = 0;i < Q;i++){
			 System.out.println(memo[R[i]] - memo[L[i]]);
		 }





	}






}
