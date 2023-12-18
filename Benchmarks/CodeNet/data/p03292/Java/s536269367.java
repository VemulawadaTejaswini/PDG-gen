import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[3];
		array[0] = sc.nextInt();
		array[1] = sc.nextInt();
		array[2] = sc.nextInt();
		Arrays.sort(array);

		int cost2 = array[1] - array[0];
		int cost3 = array[2] - array[1];
		int totalCost = cost2 + cost3;

		System.out.println(totalCost);

	}
}
