import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		Integer[] l = new Integer[n];
		for (int i = 0; i < n; i++) {
			l[i] = sc.nextInt();
		}

		int count = 0;
		int bound = 1;
		for (int i = 0; i < n; i++) {
			count = count + l[i];
			if (count <= x) {
				bound++;
			} else {
				break;
			}
		}
		System.out.println(bound);

	}

}
