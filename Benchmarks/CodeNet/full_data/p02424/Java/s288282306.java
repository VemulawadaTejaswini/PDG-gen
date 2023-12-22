import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		String a, b;
		long n;
		try (Scanner sc = new Scanner(System.in)) {
			a = sc.next();
			b = sc.next();
			n = Long.parseLong(a) & Long.parseLong(b);
			System.out.println(String.format("%32s", Long.toBinaryString(n)).replace(' ', '0'));
			n = Long.parseLong(a) | Long.parseLong(b);
			System.out.println(String.format("%32s", Long.toBinaryString(n)).replace(' ', '0'));
			n = Long.parseLong(a) ^ Long.parseLong(b);
			System.out.println(String.format("%32s", Long.toBinaryString(n)).replace(' ', '0'));
		}
	}
}

