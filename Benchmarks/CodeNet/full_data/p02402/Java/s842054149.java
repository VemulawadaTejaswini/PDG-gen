import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ints = new int[n];

		for(int i = 0; i < n; i++) {
			ints[i] = sc.nextInt();
		}

		Arrays.sort(ints);
		int sum = 0;

		for (int i = 0; i < n; i++) {
			sum += ints[i];;
		}

		System.out.println(ints[0] + " " + ints[n-1] + " " +  sum);
		sc.close();
	}

}
