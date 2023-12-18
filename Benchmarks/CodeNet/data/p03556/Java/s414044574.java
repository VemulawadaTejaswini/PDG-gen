import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int answer = 1;
		for (int i = 1; i <= n; i++) {
			if (Math.pow(i, 2) <= n && Math.pow(i, 2) > answer) {
				answer = i;
			}
		}
		System.out.println(answer);
		sc.close();
	}

}
