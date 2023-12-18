import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		String[] d = new String[k];
		for (int i = 0; i < k; i++) {
			d[i] = sc.next();
		}
		sc.close();

		label:
		for (int i = n; ; i++) {
			String s = String.valueOf(i);
			for (int j = 0; j < k; j++) {
				if (s.indexOf(d[j]) != -1) {
					continue label;
				}
			}
			System.out.println(i);
			return;
		}
	}
}
