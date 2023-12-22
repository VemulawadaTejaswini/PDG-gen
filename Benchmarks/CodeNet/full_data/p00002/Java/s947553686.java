import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int a = sc.next().length();
			int b = sc.next().length();
			System.out.println(a + b);
		}

	}
}