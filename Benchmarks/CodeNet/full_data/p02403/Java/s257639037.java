import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Integer> rows = new ArrayList<>();
		List<Integer> columns = new ArrayList<>();
		boolean flag = true;

		while (true) {
			int hor = scanner.nextInt();
			int ver = scanner.nextInt();
			if (hor == 0 && ver == 0) {
				break;
			}
			if (hor >= 1 && ver >= 1 && hor <= 300 && ver <= 300) {
				rows.add(hor);
				columns.add(ver);
			} else {
				flag = false;
				break;
			}
		}
		if (flag == true) {
			for (int i = 0; i < rows.size(); i++) {
				for (int r = 0; r < rows.get(i); r++) {
					for (int c = 0; c < columns.get(i); c++) {
						System.out.print("#");
					}
					System.out.println();
				}
				System.out.println();
			}
		}
	}
}