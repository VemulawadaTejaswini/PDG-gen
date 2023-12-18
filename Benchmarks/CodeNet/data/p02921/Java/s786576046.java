import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] S = sc.nextLine().split("");
		String[] T = sc.nextLine().split("");
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			if (S[i].equals(T[i])) {
				sum++;
			}
		}
		System.out.println(sum);
	}
}
