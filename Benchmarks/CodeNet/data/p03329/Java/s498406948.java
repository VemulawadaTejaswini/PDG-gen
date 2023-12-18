import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int i = 0;
		while (true) {
			n -= 9 * 9 * 9 * 9 * 9;
			if (n < 0) {
				n += 9 * 9 * 9 * 9 * 9;
				break;
			} else {
				i++;
			}
		}
		while (true) {
			n -= 6 * 6 * 6 * 6 * 6 * 6;
			if (n < 0) {
				n += 6 * 6 * 6 * 6 * 6 * 6;
				break;
			} else {
				i++;
			}
		}
		while (true) {
			n -= 6 * 6 * 6 * 6 * 6;
			if (n < 0) {
				n += 6 * 6 * 6 * 6 * 6;
				break;
			} else {
				i++;
			}
		}
		while (true) {
			n -= 9 * 9 * 9 * 9;
			if (n < 0) {
				n += 9 * 9 * 9 * 9;
				break;
			} else {
				i++;
			}
		}
		while (true) {
			n -= 6 * 6 * 6 * 6;
			if (n < 0) {
				n += 6 * 6 * 6 * 6;
				break;
			} else {
				i++;
			}
		}
		while (true) {
			n -= 9 * 9 * 9;
			if (n < 0) {
				n += 9 * 9 * 9;
				break;
			} else {
				i++;
			}
		}
		while (true) {
			n -= 6 * 6 * 6;
			if (n < 0) {
				n += 6 * 6 * 6;
				break;
			} else {
				i++;
			}
		}
		while (true) {
			n -= 9 * 9;
			if (n < 0) {
				n += 9 * 9;
				break;
			} else {
				i++;
			}
		}
		while (true) {
			n -= 6 * 6;
			if (n < 0) {
				n += 6 * 6;
				break;
			} else {
				i++;
			}
		}
		while (true) {
			n -= 9;
			if (n < 0) {
				n += 9;
				break;
			} else {
				i++;
			}
		}
		while (true) {
			n -= 6;
			if (n < 0) {
				n += 6;
				break;
			} else {
				i++;
			}
		}
		while (true) {
			n -= 1;
			if (n < 0) {
				n += 1;
				break;
			} else {
				i++;
			}
		}
		System.out.println(i);
	}
}
