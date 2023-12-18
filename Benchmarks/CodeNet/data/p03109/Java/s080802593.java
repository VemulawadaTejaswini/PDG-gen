import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();

		String[] sArray = s.split("/");
		if (Integer.parseInt(sArray[1]) <= 4) {
			System.out.println("Heisei");
		} else {
			System.out.println("TBD");
		}
	}
}
