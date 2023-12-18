import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static String anser ="No";

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] card = new int[9];
		for (int i = 0; i < 9; i++) {
			card[i] = scan.nextInt();
		}

		int n = scan.nextInt();
		int[] number = new int[n];

		for (int i = 0; i < n; i++) {
			number[i] = scan.nextInt();
		}

		ArrayList<Integer> machedNum = new ArrayList<>();

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < n; j++) {
				if (card[i] == number[j]) {
					machedNum.add(i+1);
					break;
				}
			}
		}

		checkBingo(machedNum,1,2,3);
		checkBingo(machedNum,4,5,6);
		checkBingo(machedNum,7,8,9);
		checkBingo(machedNum,1,4,7);
		checkBingo(machedNum,2,5,8);
		checkBingo(machedNum,3,6,9);
		checkBingo(machedNum,1,5,9);
		checkBingo(machedNum,3,5,7);

		System.out.println(anser);

	}

	private static void checkBingo(ArrayList<Integer> array, int a, int b, int c) {

		if (array.contains(a) && array.contains(b) && array.contains(c)) {
			anser = "Yes";
		}

	}

}
