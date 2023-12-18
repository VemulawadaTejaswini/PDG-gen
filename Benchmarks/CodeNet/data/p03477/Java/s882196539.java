import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int A = in.nextInt();
		int B = in.nextInt();

		int sum = 0;
		int check = 0;
		int a = 0;
		for (int i = 0; i <= N; i++) {
			a = i;
			check = 0;
			for (int j = 0; j <= String.valueOf(a).length(); j++) {
				int b = a % 10;
				a = a / 10;
				check += b;
			}
			if (check >= A && check <= B) {
				sum += i;
			}

		}
		System.out.println(sum);

	}

}
