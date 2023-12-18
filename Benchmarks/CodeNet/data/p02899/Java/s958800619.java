
import java.util.Arrays;
import java.util.Scanner;


public class Main {

	/*
	 * 余りの最大値を求める。
	 */
	public static void main(String[] args) {

		/*
		 * Scannerで値取得。
		 */
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();

		int height[] = new int[number];
		for(int i = 0; i < number; i++) {
			height[i] = s.nextInt();
		}

		int numbers[] = new int[number];

		for(int i = 0; i < number; i++) {
			numbers[height[i]]=i;
		}
		Arrays.parallelSort(numbers);
		
		for(int i = 0; i < number; i++) {
			System.out.println(numbers[i]);
		}
		
	}

}
