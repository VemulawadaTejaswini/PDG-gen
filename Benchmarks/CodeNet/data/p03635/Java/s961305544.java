import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		byte n = sc.nextByte();
		byte m = sc.nextByte();
		
		System.out.println((n - 1) * (m - 1));
	}
}