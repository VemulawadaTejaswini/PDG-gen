import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int amount = scan.nextInt();
		int[] num = new int[amount];
		for (int i = 0; i < amount; i++) {
			num[i] = scan.nextInt();
		}
		
		// Calculate Max
		int max = num[0];
		for (int i = 0; i < amount; i++) {
			if (num[i] >= max)
				max = num[i];
		}
		
		// Calculate min
		int min = num[0];
		for (int i = 0; i < amount; i++) {
			if (num[i] <= min)
				min = num[i];
		}
		
		// Calculate Sum
		int sum = 0;
		for (int i = 0; i < amount; i++) {
			sum += num[i];
		}
		
		System.out.println(min + " " + max + " " + sum);
	}
}