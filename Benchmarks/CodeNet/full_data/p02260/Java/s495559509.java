import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);
		String line1 = sc.nextLine();
		int n = Integer.parseInt(line1);

		String line2 = sc.nextLine();
		String[] kari = line2.split(" ");
		int[] num = new int[n];
		for (int i = 0; i < n; i++) {
			num[i] = Integer.parseInt(kari[i]);
		}

		int change = 0;

		for (int i = 0; i < n - 1; i++) {
			int min = num[i];
			int x = i;
			for (int j = i + 1; j < n; j++) {
				if (min > num[j]) {
					min = num[j];
					x = j;
				}
			}
			
			if (i != x) {
				int v = num[i];
				num[i] = num[x];
				num[x] = v;
				change++;
			}

		}

		StringBuilder str = new StringBuilder();

		for (int i = 0; i < n - 1; i++) {
			str.append(num[i]);
			str.append(" ");
		}
		str.append(num[n - 1]);

		System.out.println(str);
		System.out.println(change);

	}

}