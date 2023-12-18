import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[] p = new int[m];
		String[] s = new String[m];
		Map<Integer, Boolean> bMap = new HashMap<>();
		int col = 0;
		int pen = 0;

		for (int i=0; i<p.length; i++) {
			int ip = scan.nextInt();
			String is = scan.next();
			p[i] = ip;
			s[i] = is;
			bMap.put(ip, false);
		}

		for (int i=0; i<p.length; i++) {
			if (!bMap.get(p[i])) {
				if (s[i].equals("WA")) {
					pen++;
				} else {
					col++;
					bMap.put(p[i], true);
				}
			}
		}

		System.out.println(col + " " + pen);

		scan.close();

	}

}
