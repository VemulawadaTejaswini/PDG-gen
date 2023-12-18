import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String s=scan.nextLine();

		String str=s.replaceAll(",", " ");

		System.out.println(str);

	}

}