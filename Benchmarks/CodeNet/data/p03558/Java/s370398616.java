import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String in1 = sc.nextLine().trim();
		long n = Long.parseLong(in1);
		long min = calc(n * 2);

		for (int i = 3 ; i <= 100000; i++) {
			long temp = calc(n * i);
			if (min >= temp ){
				min = temp;
			}
		}
		System.out.println(min);

	}

	private static long calc(long n) {
		String str = Long.toString(n);
		char[] inArray = str.toCharArray();
		long len = str.length();
		long ans = 0;
		for (int i = 0; i < len ;i++) {
			ans = ans + Long.parseLong(Character.toString(inArray[i]));
		}
		return ans;

	}
}