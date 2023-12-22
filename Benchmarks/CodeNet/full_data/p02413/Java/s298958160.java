import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int[][] rc = new int[100][100];

		int r = sc.nextInt();
		int c = sc.nextInt();

		for(int i = 0; i < r; i++) {
			for(int j = 0; j < c; j++) {
				rc[i][j] = sc.nextInt();
			}
		}

		for(int i = 0; i < r; i++){ //
			int sum = 0;
			for(int j = 0; j < c; j++) {
				System.out.print(rc[i][j] + " ");
				sum += rc[i][j];
			}
			System.out.println(sum);
		}

		int allsum = 0;
		int sum = 0;
				
			for(int i = 0; i < c; i++) {
				sum = 0;
				for(int j = 0; j < r; j++) {
					sum += rc[j][i];
				}
				System.out.print(sum + " ");
				allsum += sum;
			}
		
		System.out.println(allsum);
		sc.close();
	}
}

