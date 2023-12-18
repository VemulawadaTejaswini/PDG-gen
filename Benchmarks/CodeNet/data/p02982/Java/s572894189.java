import java.util.Arrays;
import java.util.Scanner;
 
class Main {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int count = 0 ;
		int arr[][] = new int[n][m]; 
		
		for(int i = 0 ; i<n ; i++) {
			for(int j = 0 ; j< m ; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		
		for(int i = 0 ; i<n-1 ; i++) {
			
			for(int j = i+1 ; j< n ; j++) {
				int sum = 0 ; 
				for(int k = 0 ;k< m ; k++) {
					sum+=Math.pow(Math.abs(arr[i][k] - arr[j][k]),2);
				}
				if(Math.sqrt(sum) - (int)Math.sqrt(sum) == 0) {
					count++;
				}
			}
		
		}
		System.out.print(count);
		
		
		
		
	}
}