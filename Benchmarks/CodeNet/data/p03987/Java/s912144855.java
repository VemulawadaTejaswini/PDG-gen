import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] array = new int[N];
		for (int i=0; i<N; i++) array[i] = sc.nextInt();
		long sum = 0;
		for (int i=0; i<N; i++) {
			int min = array[i];
			for (int j=i; j<N; j++) {
				min = Math.min(min, array[j]);
				sum += min;
			}
		}
		System.out.println(sum);
		sc.close();
	}
}
