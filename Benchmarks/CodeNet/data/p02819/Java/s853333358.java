import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num;
		boolean b = true;
		num = sc.nextInt();

		if (num == 2) {
			System.out.println(num);
		} else {
			while (b) {
				for (int i = 2; i < num; i++) {
					//System.out.println(num + " " + i);
					if (num % i == 0) {
						num += 1;
					} else {
						b = false;
					}
				}
			}
			System.out.println(num);
		}
	}
}