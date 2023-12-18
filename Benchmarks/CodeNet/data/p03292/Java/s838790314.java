import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[3];
		int task = 0;
		for(int a = 0 ; a < 3 ; a++){
			numbers[a] = sc.nextInt();
		}
		sc.close();
		Arrays.sort(numbers);
		task = Math.abs(numbers[0] - numbers[1]) + Math.abs(numbers[1] - numbers[2]);
		System.out.println(task);
	}
}