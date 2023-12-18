import java.util.Scanner;

public class B_PowerSocket {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int i = 1;
		int c = 0;

		while(i < b) {
			i = i+a-1;
			c++;
		}
		System.out.println(c);
	    // Scannerクラスのインスタンスをクローズ
	    scanner.close();
	}
}