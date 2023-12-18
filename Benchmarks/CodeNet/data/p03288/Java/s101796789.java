import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int rate = sc.nextInt();
		String contest = rate < 1200 ? "ABC" : (rate < 2800 ? "ARC" : "AGC");
		System.out.println(contest);
	}
}
