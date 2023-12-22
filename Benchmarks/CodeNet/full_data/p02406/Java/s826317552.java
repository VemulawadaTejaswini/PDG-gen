import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = scan.nextInt();

		int i = 1;
		while (i <= n) {
			if (i % 3 == 0) {
				sb.append(" " + i);
			} else if (i % 10 == 3) {
				sb.append(" " + i);
			}
			i++;
		}
		System.out.print(sb);
	}
}