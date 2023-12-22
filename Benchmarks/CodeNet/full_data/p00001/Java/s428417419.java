import java.util.Scanner;


class Main {
	public static void main(String[] a) {
		Scanner scanner = new Scanner(System.in);
		int now;
		int[] kekka = new int[] {0,0,0};
		for (int i = 1; i <= 10; i++) {
			now = scanner.nextInt();
			if (kekka[0] < now) {
				kekka[2] = kekka[1];
				kekka[1] = kekka[0];
				kekka[0] = now;
			} else if (kekka[1] < now) {
				kekka[2] = kekka[1];
				kekka[1] = now;
			} else if (kekka[0] <now) {
				kekka[2] = now;
			}
		}
		
		for (int element: kekka) {
			System.out.println(element);
		}
		
	}
}