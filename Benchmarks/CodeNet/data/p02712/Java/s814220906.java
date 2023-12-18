import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int N = sc.nextInt();
			long ans = 0;
			String[] retsu = new String[N];
			for (int i = 1; i < N; i++) {
				boolean three = false;
				boolean five = false;
				if (i % 3 == 0) {
					three = true;
					retsu[i] = "Fizz";
				} else if (i % 5 == 0) {
					five = true;
					retsu[i] = "Buzz";
				}

				else {
					retsu[i] = String.valueOf(i);
				}

				if (three & five) {
					retsu[i] = "FizzBuzz";
				}
			}
			for (int i = 1; i < N; i++) {
				try {
					int num = Integer.parseInt(retsu[i]);
					ans += num;
				} catch (NumberFormatException e) {

				}

			}

			System.out.println(ans);
		} finally

		{
			sc.close();
		}
	}

}
