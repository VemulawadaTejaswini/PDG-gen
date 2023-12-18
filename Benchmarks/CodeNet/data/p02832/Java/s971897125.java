import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int current = 1;
		int answer = 0;
		boolean isAble = false;

		for (int i = 0; i < N; i++) {
			int a = scan.nextInt();
			if (a != current) answer++;
			else {
				isAble = true;
				current++;
			}
		}

		System.out.println(isAble ? answer : "-1");
	}
}