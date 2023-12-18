import java.util.Scanner;
public class Product {
	public static void main(String[] args) {
		ScannerModule sm = new ScannerModule();
		int input_a = sm.scanInt();
		int input_b = sm.scanInt();
		int seki = input_a * input_b;
		if(seki % 2 == 0) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}
	}
}
public class ScannerModule {
	Scanner scanner = new Scanner(System.in);
	int scanInt() {
		return scanner.nextInt();
	}
	String scanString() {
		return scanner.next();
	}
}