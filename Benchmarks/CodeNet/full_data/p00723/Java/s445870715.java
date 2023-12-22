import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for (int x = 0; x < n; x++) {
			String query = scanner.next();
			ArrayList<String> list = new ArrayList<String>();
			for (int i = 0; i < query.length() - 1; i++) {
				StringBuffer top = new StringBuffer(query.substring(0, i + 1));
				StringBuffer bottom = new StringBuffer(query.substring(i + 1,
						query.length()));

				String[] tops = new String[2];
				tops[0] = top.toString();
				tops[1] = top.reverse().toString();
				String[] bottoms = new String[2];
				bottoms[0] = bottom.toString();
				bottoms[1] = bottom.reverse().toString();
				for (int j = 0; j < tops.length; j++) {
					for (int j2 = 0; j2 < bottoms.length; j2++) {
						String sequence0 = tops[j] + bottoms[j2];
						String sequence1 = bottoms[j2] + tops[j];
						if (!list.contains(sequence0)) {
							list.add(sequence0);
						}
						if (!list.contains(sequence1)) {
							list.add(sequence1);
						}
					}
				}
			}
			System.out.println(list.size());
		}

	}

	static int nextInt() {
		int c;
		try {
			c = System.in.read();
			while (c != '-' && (c < '0' || c > '9'))
				c = System.in.read();
			if (c == '-')
				return -nextInt();
			int res = 0;
			while (c >= '0' && c <= '9') {
				res = res * 10 + c - '0';
				c = System.in.read();
			}
			return res;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return -1;
	}

}