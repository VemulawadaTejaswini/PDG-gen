import java.text.ParseException;
import java.util.Scanner;

public class Main {

	public static void main(String[] arges) throws ParseException {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String line2 = sc.nextLine();

		String[] k = line.split(" ");
		String[] k2 = line2.split(" ");
		Daice daice1 = new Daice(Integer.parseInt(k[0]),
				Integer.parseInt(k[1]), Integer.parseInt(k[2]),
				Integer.parseInt(k[3]), Integer.parseInt(k[4]),
				Integer.parseInt(k[5]));
		Daice daice2 = new Daice(Integer.parseInt(k2[0]),
				Integer.parseInt(k2[1]), Integer.parseInt(k2[2]),
				Integer.parseInt(k2[3]), Integer.parseInt(k2[4]),
				Integer.parseInt(k2[5]));
		for (int i = 0; i < 4; i++) {
			daice2.south();
			if (daice1.f1 == daice2.f1) {
				break;
			}
			if (i == 3) {
				daice2.west();
			}
		}
		for (int i = 0; i < 4; i++) {
			if (daice1.f1 == daice2.f1) {
				break;
			}daice2.south();
			
		}
		if (daice1.f1 != daice2.f1) {
			System.out.println("No");
		} else {
			for (int i = 0; i < 4; i++) {
				daice2.kaiten();
				if (daice1.f2 == daice2.f2) {
					break;
				}
			}
			if (daice1.f1 == daice2.f1 && daice1.f2 == daice2.f2
					&& daice1.f3 == daice2.f3 && daice1.f4 == daice2.f4
					&& daice1.f5 == daice2.f5 && daice1.f6 == daice2.f6) {
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
		}
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

		public void west() {
			int[] fs = new int[] { f1, f2, f3, f4, f5, f6 };
			f6 = fs[3];
			f3 = fs[5];
			f1 = fs[2];
			f4 = fs[0];

		}

		public void kaiten() {
			int[] fs = new int[] { f1, f2, f3, f4, f5, f6 };
			f2 = fs[3];
			f3 = fs[1];
			f4 = fs[4];
			f5 = fs[2];
		}

	}
}