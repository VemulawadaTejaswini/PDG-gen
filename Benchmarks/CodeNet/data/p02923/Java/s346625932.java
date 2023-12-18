import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max = 0;
		int p = sc.nextInt();
		int count = 0;
		for (int i = 1; i < n; i++) {
			if (p >= (p = sc.nextInt())) {
				++count;
				if (count > max) {
					max = count;
				}
			} else {
				count = 0;
			}
		}
		System.out.println(max);
	}
}
