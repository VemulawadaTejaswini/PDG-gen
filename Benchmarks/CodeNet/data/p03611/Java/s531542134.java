import java.util.Scanner;

public class Main{


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		scan.nextLine();

		int[] array = new int[n];
		int max = 0;
		for (int i = 0; i < n; i++) {
			array[i] = scan.nextInt();
			if (array[i] > max) {
				max = array[i];
			}
		}
		int[] result = new int[max + 2];
		int ans = 0;
		for (int i = 0; i < n; i++) {
			result[array[i]]++;
			result[array[i] - 1]++;
			result[array[i] + 1]++;

		}
		max = 0;
		for (int i = 0; i < n; i++) {
			if (result[i] > max) {
				max = result[i];
			}
		}
		System.out.println(max);

	}

}
