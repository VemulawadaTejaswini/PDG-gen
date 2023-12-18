import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int W = sc.nextInt();
		int[] w = new int[N];
		int[] v = new int[N];
		for(int i=0; i<N; i++){
			w[i] = sc.nextInt();
			v[i] = sc.nextInt();
		}
		
		int[][] res = new int[N+1][W+1];
		for(int i=0; i<N+1; i++){
			for(int j=0; j<W+1; j++){
				res[i][j] = 0;
			}
		}
		
		for(int i=1; i<N+1; i++){
			for(int j=1; j<W+1; j++){
				if(w[i-1] <= j){
					res[i][j] = res[i-1][j] < res[i-1][j-w[i-1]] + v[i-1] ? res[i-1][j-w[i-1]] + v[i-1] : res[i-1][j];
				} else {
					res[i][j] = res[i-1][j];
				}
			}
		}	
		System.out.println(res[N][W]);	
		
		sc.close();
	}
	
}