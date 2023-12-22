import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		int n = scan.nextInt();
		int[][] data = new int[m][n];
		int[] datac = new int[n];
		int sum = 0;
		for(int i = 0 ; i < m ; i++){
			for(int j = 0 ; j < n ; j++){
				data[i][j]=scan.nextInt();
			}
		}
		for(int i = 0 ; i < n; i ++){
			datac[i]=scan.nextInt();
		}
		for(int i = 0 ; i < m ; i++){
			for(int j = 0 ; j < n ; j++){
				sum+=data[i][j]*datac[j];
			}
			System.out.println(sum);
			sum=0;
		}
	}
}