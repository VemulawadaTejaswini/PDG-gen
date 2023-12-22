import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();

		String[] WHxyr = line.split(" ");
		int[] Z = new int[WHxyr.length];

		for (int i = 0; i < WHxyr.length; i++) {
			Z[i] = Integer.parseInt(WHxyr[i]);
		}

		if (Z[2] - Z[4] >= 0 && (Z[2] + Z[4]) <= Z[0] && Z[3] - Z[4] >= 0
				&& Z[3] + Z[4] <= Z[0]) {
			System.out.println("Yes");

		} else {
			System.out.println("No");
		}

	}

}
