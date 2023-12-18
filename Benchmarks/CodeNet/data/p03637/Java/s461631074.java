import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count_two = 0;
		int count_four = 0;

		for(int i = 0; i < N; i++) {
			int input = sc.nextInt();
			if(input == 2) {
				count_two++;
			}
			if(input % 4 == 0) {
				count_four++;
			}

		}
		int num = N;

		if(count_two > 1) {
			num = num - count_two + 1;
		}

		if(num / 2 <= count_four) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}
}