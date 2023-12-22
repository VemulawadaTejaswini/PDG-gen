import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while(true) {
			String start = sc.nextLine();
			if(start.equals("-")) break;

			int m = sc.nextInt();
			int[] shuffle = new int[m];
			for (int i = 0; i < m; i++) {
				shuffle[i] = sc.nextInt();
			}
			sc.nextLine();

			String ans = doShuffle(start, shuffle);

			System.out.println(ans);
		}
	}

	private static String doShuffle(String text, int[] shuffle) {

		for(int num : shuffle) {
			text = text.substring(num) + text.substring(0, num);
		}
		return text;
	}
}