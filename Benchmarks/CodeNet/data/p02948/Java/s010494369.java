import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		SummerVacation();
	}

	public static void SummerVacation() {

		String[] firstLine = scan.nextLine().split(" ");
		int limDay = Integer.valueOf(firstLine[1]);

		List<String[]> cospaMax = new ArrayList<>();
		for (int l = Integer.valueOf(firstLine[0]); l > 0; l--) {
			cospaMax.add(scan.nextLine().split(" "));
		}
		cospaMax.sort(new Comparator<String[]>() {
			@Override
			public int compare(String[] o1, String[] o2) {
				int ret = o2[1].compareTo(o1[1]);
				if (ret == 0) {
					ret = o2[0].compareTo(o1[0]);
				}
				return ret;
			}
		});

		int hoshu = 0;
		for (String[] s : cospaMax) {
			int payDay = Integer.valueOf(s[0]);
			if (payDay <= limDay) {
				hoshu += Integer.valueOf(s[1]);
				limDay--;
			}
		}
		System.out.println(hoshu);
	}
}
