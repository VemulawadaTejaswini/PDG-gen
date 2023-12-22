import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		for (int a = 1; a < n/2; a++) {
			for (int b = 1; b < n; b++) {
				for (int c = 1; c < n; c++) {
					if (n == (a*b)+c) {
						if (a == b) {
							count = count + 1;
						} else {
							count = count + 2;
						}
					}
				}
			}
		}
		System.out.println(count);
	}

}