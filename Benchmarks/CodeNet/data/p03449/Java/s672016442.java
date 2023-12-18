import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		
		int[][] a = new int[2][n];
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < n; j++) {
				a[i][j] = stdIn.nextInt();
				
			}
		}
		
		int  ans = 0;
		int base = 0;
		
		for(int i = 0; i < n; i++){
			int max = 0;
			base += a[0][i];
			
			max = base;
			
			for(int j = i; j < n; j++) {
				max += a[1][j];
				
			}
			
			ans = Math.max(ans,max);
			
		}
		System.out.println(ans);
		
	}

}
