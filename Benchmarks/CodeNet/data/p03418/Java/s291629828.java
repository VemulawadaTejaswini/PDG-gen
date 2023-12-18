import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = sc.nextInt();
		int rest = sc.nextInt();
		int result = 0;
		for (int a = 1; a <= max; a++) {
			for (int b = 1; b <= max; b++) {
				if (a % b >= rest) {
					result++;
				}
			}
		}
		System.out.println(result);
	}
}