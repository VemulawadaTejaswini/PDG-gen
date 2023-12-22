import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int[][] A = new int[a][b];

		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++){
				A[i][j] = sc.nextInt();
			}
		}
		int[] columSum = new int[a];
		int[] rawSum = new int[b];
		int total = 0;

		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++){
				columSum[i] += A[i][j];
				rawSum[j] += A[i][j];
				System.out.print(A[i][j] + " ");
				if(j == b-1) System.out.print(columSum[i]);
			}
			System.out.println();
			if(i == a-1) {
				for (int num : rawSum) {
					total += num;
					System.out.print(num + " ");
				}
				System.out.print(total + " ");
			}
		}
		sc.close();
	}
}