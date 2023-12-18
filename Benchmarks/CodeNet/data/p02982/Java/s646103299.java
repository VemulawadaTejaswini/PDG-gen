import java.util.Scanner;

public class Main {
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int d = sc.nextInt();
		int[][] x = new int[n][d];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < d; j++) {
				x[i][j] = sc.nextInt();
			}
		}
		
		int count = 0;
		for(int i = 0; i < n; i++) {
			double dist = 0;
			for(int j = i; j < n-1; j++) {
				for(int k = 0; k < d; k++) {
					dist += Math.pow(Math.abs(x[j][k]- x[j+1][k]), 2);					
				}
				if(Math.sqrt(dist) == (int)Math.sqrt(dist)) {
					count++;
				}
			}
		}
		
		System.out.println(count);

	}
	
}