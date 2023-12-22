import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] array = new long[n-1];
		long result = 1;
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
			result = result * array[i];
		}
		if(result <= 1000000000000000000L) {
			System.out.println(-1);
		}else {
			System.out.println(result);
		}

		sc.close();
	}
}
