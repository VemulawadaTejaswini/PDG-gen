import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int max = Math.max(Math.max(a, b), c);
		boolean bool = false;
		int count = 0;
		if (a != max) {
			count += (max - a) / 2;
			if ((max - a) % 2 == 1) {
				bool = true;
			}
		}
		if (b != max) {
			count += (max - b) / 2;
			if ((max - b) % 2 == 1) {
				if (bool == false) {
					bool = true;
				} else {
					count++;
					bool = false;
				}
			}
		}
		if (c != max) {
			count += (max - c) / 2;
			if ((max - c) % 2 == 1) {
				if (bool == false) {
					bool = true;
				} else {
					count++;
					bool = false;
				}
			}
		}
		if (bool == true) {
			count += 2;
		}
		System.out.println(count);
	}
}