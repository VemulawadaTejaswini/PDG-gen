import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] arges) throws ParseException {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] kz = line.split(" ");
		int v1 = Integer.parseInt(kz[0]);
		int v2 = Integer.parseInt(kz[1]);
		List<Integer> v1list = new ArrayList<Integer>();
		List<Integer> v2list = new ArrayList<Integer>();
		for (int i = 1; i <= v1; i++) {
			if (v1 % i == 0) {
				v1list.add(i);
			}
		}
		for (int i = 1; i <= v2; i++) {
			if (v2 % i == 0) {
				v2list.add(i);
			}
		}
		List<Integer> kouyaku = new ArrayList<Integer>();
		for (Integer integer : v1list) {
			for (Integer in : v2list) {
				if (integer == in) {
					kouyaku.add(integer);
				}
			}
		}
		System.out.println(java.util.Collections.max(kouyaku));

	}
}