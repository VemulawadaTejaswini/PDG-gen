import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();

		int min = Integer.MAX_VALUE;
		for (int i = 0; i < S.length() - 2; i++) {
			int subS = Integer.parseInt(S.substring(i, i + 3));
			if (min > Math.abs(753 - subS))
				min = Math.abs(753 - subS);
		}

		System.out.println(min);

		sc.close();
	}
}