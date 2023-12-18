import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] arr = s.toCharArray();
		sc.close();

		int ans0 = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0 && arr[i] == '1') {
				ans0++;
			} else if (i % 2 == 1 && arr[i] == '0') {
				ans0++;
			}
		}

		int ans1 = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0 && arr[i] == '0') {
				ans1++;
			} else if (i % 2 == 1 && arr[i] == '1') {
				ans1++;
			}
		}

		System.out.println(Math.min(ans0, ans1));
	}
}
