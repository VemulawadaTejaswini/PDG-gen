
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String line = scanner.next();
			loop: if (line.length() % 2 == 1) {
				System.out.println("NA");
			} else {
				int[][] num = new int[line.length() / 2][2];
				for (int i = 0; i < line.length() / 2; i++) {
					int a = line.charAt(i * 2) - '0';
					int b = line.charAt(i * 2 + 1) - '0';
					if (a > 6 || b > 5) {
						System.out.println("NA");
						break loop;
					}
					num[i][0] = a - 1;
					num[i][1] = b - 1;
					
				}
				char[] ch = {'z','.','?','!',' '};
				for (int[] t : num) {
					if (t[0] != 5) {
						System.out.print((char) (t[0] * 5 + t[1] + 'a'));
					}
					else{
						System.out.print(ch[t[1]]);
					}
				}
				System.out.println();

			}
		}
	}
}