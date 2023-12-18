import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[][] F = new int[N][10];
		int[][] P = new int[N][11];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 10; j++) {
				F[i][j] = scan.nextInt();
			}
		}
		
		
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 11; j++) {
				P[i][j] = scan.nextInt();
			}
		}
		
//		for (int i = 0; i < N; i++) {
//			for (int j = 0; j < 10; j++) {
//				System.out.print(F[i][j]+" ");
//			}
//			System.out.println();
//		}
//		
//		for (int i = 0; i < N; i++) {
//			for (int j = 0; j < 11; j++) {
//				System.out.print(P[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		int[] sum = new int[N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 10; j++) {
				if(F[i][j]!=0){
					sum[i]++;
				}
			}
		}
		
//		for (int i = 0; i < sum.length; i++) {
//			System.out.print(sum[i]+" ");
//		}
		
		int max[] = new int[N];
		for (int i = 0; i < N; i++) {
			int temp = Integer.MIN_VALUE;
			for (int j = 1; j <= sum[i]; j++) {
				if(P[i][j]> temp){
					temp = P[i][j];
				}
			}
			max[i] = temp;
		}
		
//		for (int i = 0; i < max.length; i++) {
//			System.out.print(max[i]+" ");
//		}
		
		int sum1 = 0;
		for (int i = 0; i < max.length; i++) {
			sum1+= max[i];
		}
		System.out.println(sum1);
	}
}