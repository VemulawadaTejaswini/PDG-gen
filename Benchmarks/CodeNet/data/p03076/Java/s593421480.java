import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		byte[] time = new byte[5];
		for (int i=0; i<5; i++) time[i] = scanner.nextByte();

		int base = 0;
		for (byte t : time) base += up(t);

		int min1 = 10;
		for (byte t: time) {
			if (t%10!=0) min1 = Math.min(min1, t%10);
		}

		System.out.println(base-10+min1);
	}

	static int up(byte b) {
		double d = b/10d;
		return (int) Math.ceil(d)*10;
	}
}