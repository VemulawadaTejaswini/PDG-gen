import java.util.Arrays;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);


		int n = Integer.parseInt(scanner.nextLine());

		String[] temp = scanner.nextLine().split(" ");
		int[] list    = new int[n];

		for(int i = 0; i < n; i++) {
			list[i] = Integer.parseInt(temp[i]);
		}

		int count = 0;

		Arrays.sort(list);




		for(int i = n - 1; 2 <= i; i--) {
			for(int j = i - 1; 1 <= j; j--) {
				if(list[j] < list[i] / 2) break;

				for(int k = j - 1;  0 <= k; k--) {
					count += list[k] + list[j] > list[i] ? 1 : 0;

				}
			}
		}

		System.out.println(count);

	}
}
