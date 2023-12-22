import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] data = input.split(" ");
		int a = Integer.parseInt(data[0]);
		int b = Integer.parseInt(data[1]);
		int c = Integer.parseInt(data[2]);
		List<Integer> divisors = new ArrayList<Integer>();
		// int n = 0; // divisorsの要素番号
		int count = 0; // a～bまでの範囲の中にcがいくつあるのかをカウントするための変数

		if ((1 <= a && a <= 10000) && (1 <= b && b <= 10000)
				&& (1 <= c && c <= 10000) && (a <= b)) {
			divisors = ArrayDivisors(c);

			for (Integer n : divisors) {
				if (a <= n && n <= b) {
					count++;
				}
			}
			System.out.println(count);
		}

	}

	private static List<Integer> ArrayDivisors(int number) {
		int MinDivisor = 1;
		int MaxDivisor = number;
		List<Integer> divisors = new ArrayList<Integer>();
		for (int i = MinDivisor; i <= MaxDivisor; i++) {
			if (number % i == 0) {
				MinDivisor = i;
				MaxDivisor = number / i;
				if (MinDivisor <= MaxDivisor) {
					divisors.add(MinDivisor);
					if (MinDivisor != MaxDivisor) {
						divisors.add(MaxDivisor);
					} else {
						break;
					}
				}

			}

		}

		Collections.sort(divisors);
		return divisors;

	}

}

