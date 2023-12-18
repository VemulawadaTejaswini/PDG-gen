import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		boolean[] accepted = new boolean[n];
		int ac = 0;
		int answer = 0;
		for (int i = 0; i < m; i++) {
			int x = sc.nextInt() - 1;
			String s = sc.nextLine();
			if (accepted[x]) continue;
			if (s.contains("AC")) {
				accepted[x] = true;
				ac++;
			} else {
				answer++;
			}
		}


		System.out.println(ac + " " + answer);
	}
}
