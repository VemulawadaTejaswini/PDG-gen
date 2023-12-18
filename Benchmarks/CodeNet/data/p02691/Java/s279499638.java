import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int[] A = new int[N];
		for(int i = 0; i < N; i++) A[i] = scanner.nextInt(); 
		int count = 0;
		for(int i = 0; i < N; i++) {
			for(int j = i + A[i]; j < N; j++) {
				if(A[j] <= N && A[i] + A[j] == j - i) count++;
			}
		}
		System.out.println(count);
	}
}
