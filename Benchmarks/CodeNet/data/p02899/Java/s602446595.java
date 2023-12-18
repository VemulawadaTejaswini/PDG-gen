
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

		int order1[] = new int[number];
		int order2[] = new int[number];

		for(int i = 0; i < number; i++) {
			order1[i] = s.nextInt() -1;
			order2[i] = order1[i];
		}

		Arrays.parallelSort(order1);

		int numbers[] = new int[number];

		for(int i = 0; i < number; i++) {
			numbers[order2[i]]=i;
			//出席番号と順番を変える
		}

		for(int i = 0; i < number; i++) {
			int order = order1[i];
			System.out.println(numbers[order] +1);
		}

	}

}
