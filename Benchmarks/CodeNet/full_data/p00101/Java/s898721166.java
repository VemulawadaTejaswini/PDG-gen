import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < n; i++) {
			String[] str = sc.nextLine().split(" ");
			int len = str.length;
			for (int j = 0; j < len; j++) {
				if ("Hoshino".equals(str[j])) {
					str[j] = "Hoshina";
				}
			}
			for (Iterator<String> ite = Arrays.asList(str).iterator(); ite.hasNext();) {
				String s = ite.next();
				System.out.print(s);
				if (ite.hasNext()) {
					System.out.print(" ");
				}
			}
			if (sc.hasNextLine()) {
				System.out.println("");
			}
		}
	}
}