import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[] p = new int[m];
		String[] s = new String[m];
		List<Integer> ac = new ArrayList<>();

		for (int i = 0; i < m; i++) {
			int ip = scan.nextInt();
			String is = scan.next();
			p[i] = ip;
			s[i] = is;
			if (!ac.contains(ip)) {
				if (is.equals("AC"))
					ac.add(ip);
			}
		}

		int cor = ac.size();
		int pen = 0;

		for (int i = 0; i < ac.size(); i++) {
			for (int j = 0; j < m; j++) {
				if (ac.get(i) == p[j]) {
					if (s[j].equals("WA")) {
						pen++;
					} else {
						break;
					}
				}
			}
		}

		System.out.println(cor + " " + pen);

		scan.close();

	}

}
