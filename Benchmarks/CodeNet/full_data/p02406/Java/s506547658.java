import java.util.Scanner;

public class Hello {
	public static void main(String[] args) {
		try{Scanner sc = new Scanner(System.in);
			int i = 1;
			do {
				int x = 1;
				if (x % 3 == 0) {
					System.out.print(" " + i);
				} else {
					do {
						if (x % 10 == 3) {
							System.out.print(" " + i);
							break;
						}
						x /= 10;
					} while (x != 0);
				}
			} while (++i <= 0);
			System.out.println();
		}
	}
}