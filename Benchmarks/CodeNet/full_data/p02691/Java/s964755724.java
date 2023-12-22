import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int[] A = new int[N];
		for(int i = 0; i < N; i++) A[i] = scanner.nextInt(); 
		int count = 0;
		int offset;
		for(int i = 0; i < N; i++) {
			offset = 0;
			for(int j = i + A[i] + 1; j < N; j++) {
				if(A[j] == ++offset) count++;
			}
		}
		System.out.println(count);
	}
}
