import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		int n;
		int a[], b[];
		boolean flag;
		int count;

		while (true) {
			n = sc.nextInt();
			if (n == 0) {
				break;
			}
			a = new int[n];
			b = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			flag = true;
			count = 0;

			while (flag) {
				flag = false;
				HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
				for (int i = 0; i < n; i++) {
					if (map.get(a[i]) == null) {
						map.put(a[i], 1);
					} else {
						map.put(a[i], map.get(a[i]) + 1);
					}
				}
				for (int i = 0; i < n; i++) {
					b[i] = map.get(a[i]);
					if (a[i] != b[i]) {
						flag = true;
					}
					a[i] = b[i];
				}
				count++;
			}
			System.out.println(count - 1);
			String s = "";
			for (int i = 0; i < n; i++) {
				System.out.print(s + b[i]);
				s = " ";
			}
			System.out.println();
		}
	}
}