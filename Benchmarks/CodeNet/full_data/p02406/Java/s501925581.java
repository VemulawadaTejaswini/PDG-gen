import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		while (true) {
			int x = i;
			if (x % 3 == 0) {
				System.out.println(" %d", i);
			} else {
				while (true) {
					if (x % 10 == 3) {
						System.out.println(" %d", i);
						break;
					} else {
						x /= 10;
						if (x == 0)
							break;
					}
				}
			}
			if (++i > n) {
				System.out.print("\n");
				break;
			}
		}
	}

}