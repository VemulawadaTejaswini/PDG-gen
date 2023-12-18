import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = Integer.parseInt(scanner.nextLine());
		int[] A = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int count = 0;
		for(int i = 0; i < N; i++) {
			for(int j = i + A[i]; j < N; j++) {
				if(A[i] + A[j] == j - i) count++;
			}
		}
		System.out.println(count);
	}
}
