import java.text.ParseException;
import java.util.Scanner;

public class Main {

	public static void main(String[] arges) throws ParseException {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String line2 = sc.nextLine();
		String[] k = line.split(" ");
		int[] v = new int[k.length];
		for (int i = 0; i < k.length; i++) {
			v[i] = Integer.parseInt(k[i]);
		}
		Daice daice = new Daice(v[0], v[1], v[2], v[3], v[4], v[5]);
		for (int i = 0; i < line2.length(); i++) {
			if (line2.substring(i, i + 1).equals("S")) {
				daice.south();
			} else if (line2.substring(i, i + 1).equals("E")) {
				daice.east();
			} else if (line2.substring(i, i + 1).equals("W")) {
				daice.west();
			} else if (line2.substring(i, i + 1).equals("N")) {
				daice.nouth();
			}

		}
		System.out.println(daice.f1);
	}

	public static class Daice {

		int f1;
		int f2;
		int f3;
		int f4;
		int f5;
		int f6;

		public Daice(int f1, int f2, int f3, int f4, int f5, int f6) {
			super();
			this.f1 = f1;
			this.f2 = f2;
			this.f3 = f3;
			this.f4 = f4;
			this.f5 = f5;
			this.f6 = f6;
		}

		public void south() {
			int[] fs = new int[] { f1, f2, f3, f4, f5, f6 };
			f6 = fs[1];
			f2 = fs[0];
			f1 = fs[4];
			f5 = fs[5];

		}

		public void nouth() {
			int[] fs = new int[] { f1, f2, f3, f4, f5, f6 };
			f6 = fs[4];
			f2 = fs[5];
			f1 = fs[1];
			f5 = fs[0];
		}

		public void east() {
			int[] fs = new int[] { f1, f2, f3, f4, f5, f6 };
			f6 = fs[2];
			f3 = fs[0];
			f1 = fs[3];
			f4 = fs[5];
		}

		public void west() {
			int[] fs = new int[] { f1, f2, f3, f4, f5, f6 };
			f6 = fs[3];
			f3 = fs[5];
			f1 = fs[2];
			f4 = fs[0];

		}

	}
}