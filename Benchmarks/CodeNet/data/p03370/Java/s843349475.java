import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int X = sc.nextInt();

		int[] unko = new int[N];

		int sum =0;

		for(int i=0;i<N;i++) {
			unko[i] = sc.nextInt();
			sum += unko[i];
		}

		Arrays.sort(unko);

		int result = N;

		int nokori = X - sum;

		result += ( nokori / unko[0]);

		System.out.println(result);
	}

}
