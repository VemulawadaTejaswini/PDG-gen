import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] task = new int[3];
		task[0] = sc.nextInt();
		task[1] = sc.nextInt();
		task[2] = sc.nextInt();
		Arrays.sort(task);
		int cost = 0;
		for (int i = 1; i < 3; i++) {
			cost += task[i] - task[i - 1];
		}
		System.out.println(cost);

	}

}
