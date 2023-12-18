import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sx = sc.nextInt();
		int sy = sc.nextInt();
		int tx = sc.nextInt();
		int ty = sc.nextInt();

		StringBuilder str = new StringBuilder();
			for (int i = 0; i < tx-sx; i++) {
				str.append("R");
			}
			for (int i = 0; i < ty-sy; i++) {
				str.append("U");
			}
			for (int i = 0; i < tx-sx; i++) {
				str.append("L");
			}
			for (int i = 0; i < ty-sy; i++) {
				str.append("D");
			}

			str.append("DR");
			for (int i = 0; i < tx-sx; i++) {
				str.append("R");
			}
			for (int i = 0; i < ty-sy; i++) {
				str.append("U");
			}
			str.append("ULUL");

			for (int i = 0; i < tx-sx; i++) {
				str.append("L");
			}
			for (int i = 0; i < ty-sy; i++) {
				str.append("D");
			}
			str.append("DR");

		System.out.println(str.toString());
	}
}
