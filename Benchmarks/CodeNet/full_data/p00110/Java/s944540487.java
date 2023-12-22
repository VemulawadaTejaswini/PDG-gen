import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 150; i++) {
			try {
				String str = sc.next();
				for (int j = 0; j < 10; j++) {
					String e = str.replace("X", Integer.toString(j));
					String[] tmp = e.split("\\+");
					String a = tmp[0];
					String[] tmp_ = tmp[1].split("=");
					String b = tmp_[0];
					String c = tmp_[1];
					if ((a.charAt(0) != '0' && a.length() > 1 || a.length() == 1)
						&& (b.charAt(0) != '0' && b.length() > 1 || b.length() == 1)
						&& (c.charAt(0) != '0' && c.length() > 1 || c.length() == 1)) {
						BigDecimal A = new BigDecimal(a);
						BigDecimal B = new BigDecimal(b);
						BigDecimal C = new BigDecimal(c);
						if (A.add(B).compareTo(C) == 0) {
							System.out.println(j);
							break;
						}
					}
					if (j == 9) {
						System.out.println("NA");
					}
				}
			} catch (Exception e) {
				break;
			}
		}
	}
}
