import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] all = new int[n];
		int sum = 0;

		for(int i = 0; i < n; i++) {
			all[i] = sc.nextInt();
			sum += all[i];
		}

		Arrays.sort(all);
		int calc = sum;
		int count = 0;
		while(calc % 10 == 0) {
			if(count > 0) {
				calc = sum;
			}
			calc -= all[count];
			count++;
		}

		System.out.println(calc);
	}

}
