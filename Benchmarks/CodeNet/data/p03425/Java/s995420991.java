import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int z = sc.nextInt();
		int m = 0;
		int a = 0;
		int r = 0;
		int c = 0;
		int h = 0;
		String s;
		ArrayList<String> array = new ArrayList<String>();
		for (int i = 0; i < z; i++) {
			array.add(sc.next());
		}
		for (int j = 0; j < z; j++) {
			s = array.get(j);
			if (s.substring(0, 1).contains("M")) {
				m++;
			} else if (s.substring(0, 1).contains("A")) {
				a++;
			} else if (s.substring(0, 1).contains("R")) {
				r++;
			} else if (s.substring(0, 1).contains("C")) {
				c++;
			} else if (s.substring(0, 1).contains("H")) {
				h++;
			}
		}
		if (m + a + r + c + h == 0) {
			System.out.println("0");
		} else {
			if (m == 0) {
				m++;
			}
			if (a == 0) {
				a++;
			}
			if (r == 0) {
				r++;
			}
			if (c == 0) {
				c++;
			}
			if (h == 0) {
				h++;
			}
			System.out.println(m * a * r * c * h);
		}
	}
}