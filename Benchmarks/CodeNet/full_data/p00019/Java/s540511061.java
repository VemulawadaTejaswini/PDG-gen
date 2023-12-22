

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.next());
		System.out.println(calc(num));
		sc.close();
	}
	static long calc (int num) {
		if (num == 1) {
			return num;
		} else {
			return num * calc(num - 1);
		}
	}

}

