import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long S = scan.nextLong();
		long h = S / 3600;
		long m = Math.floorMod(S, 3600) / 60;
		long s = Math.floorMod(S, 60);
		System.out.println(h + ":" + m + ":" + s);
	}
}