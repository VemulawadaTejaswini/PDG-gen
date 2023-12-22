import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int S = new Scanner(System.in).nextInt();
		int h = S / 3600;
		int z = S - h * 3600;
		int m = z / 60;
		int s = z - m * 60;
		System.out.println(h + ":" + m + ":" + s);

	}
}
