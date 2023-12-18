import java.util.Scanner;

class Main {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		
		int r = scanner.nextInt(); // グー
		int s = scanner.nextInt(); // チョキ
		int p = scanner.nextInt(); // パー
		
		String str = scanner.next();
		
		char b = 0;
		int sum = 0;
		for (int i = 0, c = 1; i < n; i++, c++) {
			char st = str.charAt(i);
			if (c == (k - 1)) {
				b = st;
			}
			else if (c == k) {
				if (b == st) {
					st = 0;
				}
			}
			switch (st) {
				case 'r':
					sum += p;
					break;
				case 's':
					sum += r;
					break;
				case 'p':
					sum += s;
					break;
				default:
			}
		}
		System.out.println(sum);
	}
}