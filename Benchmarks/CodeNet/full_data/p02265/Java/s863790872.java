import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);
		String line1 = sc.nextLine();
		int n = Integer.parseInt(line1);

		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < n; i++) {
			String kari = sc.nextLine();

			if (kari.equals("deleteFirst")) {
				list.remove(list.size() - 1);
			} else if (kari.equals("deleteLast")) {
				list.remove(0);
			} else {
				String[] kari2 = kari.split(" ");
				int x = Integer.parseInt(kari2[1]);
				if (kari2[0].equals("insert")) {
					list.add(x);
				} else if (kari2[0].equals("delete")) {
					if (list.contains(x)) {
						list.remove(list.lastIndexOf(x));
					}
				}
			}
		}

		while (list.size() > 1) {
			System.out.print(list.get(list.size() - 1));
			System.out.print(" ");
			list.remove(list.size() - 1);
		}
		System.out.println(list.get(0));
	}

}