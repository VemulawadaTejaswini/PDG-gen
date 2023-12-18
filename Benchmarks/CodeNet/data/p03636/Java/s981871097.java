import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final String s = sc.next();
		final String[] sList = s.split("");

		System.out.print(sList[0] + (sList.length - 2) + sList[sList.length - 1]);

	}

}