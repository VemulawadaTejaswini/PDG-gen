import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Long x = sc.nextLong();
		Long a500 = x / 500;
		Long aamari = x - a500 * 500;
		Long a5 = aamari / 5;
		Long kotae = (a500 * 1000) + (a5 * 5);

		System.out.println(kotae);

		sc.close();
	}

}