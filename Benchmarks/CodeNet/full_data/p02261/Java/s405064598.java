import java.util.Scanner;

public class Main {
	public static void main(String[] arges) {

		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		int v = Integer.parseInt(line);
		int[] vs = new int[v];
		String line2 = sc.nextLine();
		String[] k = line2.split(" ");

		String[] k2 = k;

		vs = Card.tyuushutu(k2);

		for (int i = 0; i < v; i++) {
			for (int j = v - 1; j > 0; j--) {
				int key = j - 1;
				if (vs[key] > vs[j]) {
					int a = vs[key];
					int b = vs[j];

					vs[key] = b;
					vs[j] = a;

				}
			}
		}
		int kako = 0;
		StringBuilder sb = new StringBuilder();
		for (int in : vs) {
			if (in == kako) {
				continue;
			}
			for (int i = 0; i < v; i++) {
				if (k2[i].substring(1).equals(String.valueOf(in))) {
					sb.append(k2[i]);
					if (in != vs[v - 1]) {
						sb.append(" ");
					}
				}

			}
			kako = in;
		}
		System.out.println(sb);
		System.out.println("Stable");
		int[] v3 = new int[v];
		v3 = Card.tyuushutu(k);
		for (int i = 0; i < v; i++) {
			int min = i;
			for (int j = i; j < v; j++) {
				if (v3[min] > v3[j]) {
					min = j;

				}
				if (min != i) {
					int c = v3[min];
					int d = v3[i];
					v3[min] = d;
					v3[i] = c;
				}
			}
		} kako = 0;
		StringBuilder sb2 = new StringBuilder();
		for (int in : vs) {
			if (in == kako) {
				continue;
			}
			for (int i = 0; i < v; i++) {
				if (k2[i].substring(1).equals(String.valueOf(in))) {
					sb2.append(k2[i]);
					if (in != v3[v - 1]) {
						sb2.append(" ");
					}
				}

			}
			kako = in;
		}
		System.out.println(sb2);
System.out.println("Stable");
	}

	public static class Card {

		public static int[] tyuushutu(String[] ks) {
			int[] newks = new int[ks.length];
			for (int i = 0; i < ks.length; i++) {
				newks[i] = Integer.parseInt(ks[i].substring(1));
			}
			return newks;
		}
	}
}