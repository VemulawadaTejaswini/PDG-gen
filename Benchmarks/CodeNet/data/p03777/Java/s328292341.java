public class Main {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);

		char a = sc.next().charAt(0);
		char b = sc.next().charAt(0);


		if (a == 'H') {
			if (b == 'H') {
				System.out.println('H');
			}else {
				System.out.println('D');
			}
		}else {
			if (b == 'H') {
				System.out.println('D');
			} else {
				System.out.println('H');
			}
		}

	}
}
