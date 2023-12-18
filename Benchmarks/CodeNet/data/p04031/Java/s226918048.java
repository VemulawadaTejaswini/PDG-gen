import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numbers = sc.nextInt();
		int[] values = new int[numbers];
		int sum = 0;
		for (int i = 0; i < numbers; i++) {
			values[i] = sc.nextInt();
			sum += values[i];
		}
		
		// finding the average
		int average = sum/numbers;
		
		// computing the cost
		int totalcost = 0;
		for (int i = 0; i < numbers; i++) {
			totalcost += (values[i] - average) * (values[i] - average);
		}
		System.out.println(totalcost);
	}
}