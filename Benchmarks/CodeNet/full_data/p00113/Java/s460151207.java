import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int p = sc.nextInt();
			int q = sc.nextInt();
			int mod[] = new int[80];
			int div[] = new int[80];
			for (int i = 0; i < 80; i++) {
				mod[i] = p;
				p *= 10;
				div[i] = p / q;
				p %= q;
				if (p == 0) {
					for (int j = 0; j <= i; j++) {
						System.out.print(div[j]);
					}
					System.out.println();
					break;
				}
				for (int j = 0; j <= i; j++) {
					if (mod[j] == p) {
						for (int k = 0; k <= i; k++) {
							System.out.print(div[k]);
						}
						System.out.println();
						for (int k = 0; k <= i; k++) {
							if (k < j)
								System.out.print(" ");
							else
								System.out.print("^");
						}
						System.out.println();
						i = 80;
						break;
					}
				}
			}
		}
	}
}