import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
 		Scanner scanner = new Scanner(System.in);
 		int N = scanner.nextInt();
 		int min = 0;
 		int sum = 0;
 		int L[] = new int[N];
 		for (int i = 0;i < N; i++) {
 			int x = scanner.nextInt();
 			L[i] = x;
 		}
 		Arrays.sort(L);
 		for (int i = 0; i < N - 1; i++) {
 			for (int j = i + 1; j < N; j++) {
 				min = L[i] + L[j];
 				for (int k = j + 1; k < N; k++) {
 					if (min > L[k]) {
 						sum += 1;
 						//System.out.println(L[i] +","+ L[j] +"," + L[k]);
 					}
 				}
 			}
 		}
 		System.out.println(sum);
	}
}
