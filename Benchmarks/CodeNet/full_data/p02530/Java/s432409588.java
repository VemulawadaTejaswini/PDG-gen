import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int a = sc.nextInt();
			int b = 0, c = 0;
			String d, e;
			int g = 0, h = 0;
			for (int i = 0; i < a; i++) {
				d = sc.next();
				e = sc.next();
				int f = d.compareTo(e);
				if (f == -1) {
					g += 3;
				} else if (f == 0) {
					g += 1;
					h += 1;
				} else if (f == 1) {
					h += 3;
				}
			}
		}
		System.out.println(g + " " + h);
	}
}