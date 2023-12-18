import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		long k = sc.nextLong();

		long[] arr = new long[50];

		long start = k / 50;
		long time = k % 50;

		for (int i = 0; i < 50; i++) {
			arr[i] = start + i;
		}

		for (int i = 0; i < time; i++) {
			for(int j = 0; j < 50; j++) {
				if(i!=j) arr[j]--;
				else arr[j] += 50;
			}
		}
		System.out.println(50);
		for (long i : arr) {
			System.out.print(i + " ");
		}
	}
}