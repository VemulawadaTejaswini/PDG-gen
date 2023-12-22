import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean[][] check = new boolean[4][14];
		int card = sc.nextInt();

		for (int i = 0; i < card; i++) {
			String s = sc.next();
			int number = sc.nextInt();
			int index = s.equals("S") ? 0 : s.equals("H") ? 1 :
						s.equals("C") ? 2 : 3;
			check[index][number] = true;
		}

		for (int i = 0; i < check.length; i++) {
			for (int j = 1; j < check[i].length; j++) {
				if (!check[i][j]) {
					System.out.print(i == 0 ? "S" : i == 1 ? "H" :
									 i == 2 ? "C" : "D");
					System.out.println(" " + j);
				}
			}
		}

	}

}