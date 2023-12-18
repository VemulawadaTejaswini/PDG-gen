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
		s.close();

		/*
		 * 少し試行すると最大値が変わらないため、
		 * 割る数を1つずつ値をずらして求めてみる。
		 * i ％ (i + 1)
		 * →結局1からnumber-1までの和になるから計算する。
		 */

		long max = 0;
		//max:答え,intを越える可能性があるため。
		max = (1 + number -1)* (number-1) /2;
//		for(int i = 1; i < number; i++) {
//			max += i % (i + 1);
//		}

		System.out.println(max);

	}

}
