import java.util.*;

public class Main {

	public static int[] arr;
	public static char[] answer;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		arr = new int[4];
		answer = new char[3];
		for (int i = 3; i >= 0; i--) {
			arr[i] = n % 10;
			n /= 10;
		}
		
		answer(0, new char[3]);
		System.out.printf("%d", arr[0]);
		for (int i = 0; i < answer.length; i++) {
			System.out.printf("%c%d", answer[i], arr[i + 1]);
		}
		System.out.printf("=7\n", arr[arr.length - 1]);
	}
	
	public static void answer(int index, char[] ops) {
		if (index == ops.length) {
			if (is7(ops)) {
				for (int i = 0; i < ops.length; i++) {
					answer[i] = ops[i];
				}
			}
		} else {
			ops[index] = '-';
			answer(index + 1, ops);
			ops[index] = '+';
			answer(index + 1, ops);
		}
	}
	
	public static boolean is7(char[] ops) {
		int n = arr[0];
		for (int i = 0; i < ops.length; i++) {
			if (ops[i] == '-') {
				n -= arr[i + 1];
			} else if (ops[i] == '+') {
				n += arr[i + 1];
			}
		}
		return n == 7;
	}
}
