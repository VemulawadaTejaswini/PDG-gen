
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static int result;
	static int reader;
	static ArrayList<Boolean> list;

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			String s = sc.next();
			result = n;

			list = new ArrayList<Boolean>(n);
			for (int i = 0; i < n; i++) {
				list.add(s.charAt(i) == 'E');
			}

			for (int i = 0; i < n; i++) {
				int count = 0;
				for (int j = 0; j < i; j++) {
					if (!list.get(j)) {
						count++;
					}
				}
				for (int j = i; j < n; j++) {
					if (list.get(j)) {
						count++;
					}
				}
				if (count < result) {
					result = count;
				}
			}


			System.out.println(result);
		}
	}
}
