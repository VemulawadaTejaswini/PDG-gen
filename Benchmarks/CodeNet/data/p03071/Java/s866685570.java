import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input1 = scanner.next();
		String input2 = scanner.next();
		System.out.println(input1);
		System.out.println(input2);
		scanner.close();

		int A = Integer.valueOf(input1);
		int B = Integer.valueOf(input2);

		// 対称性によりAが大きい方とする
		if(A < B) {
			int tmp = A;
			A = B;
			B = tmp;
		}
		// 2つめはどっちかなのでこれで決まる
		int result1 = A + A - 1;
		int result2 = A + B;
		if(result1 >= result2) {
			System.out.println(result1);
		} else {
			System.out.println(result2);
		}
	}

}
