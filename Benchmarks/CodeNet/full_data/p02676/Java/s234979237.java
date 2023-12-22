import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int K = sc.nextInt();
		sc.nextLine();
		String str = sc.nextLine();


		if(str.length() <= K) {
			System.out.println(str);
			return;
		}

		String str2 = str.substring(0,K) + "...";

		System.out.println(str2);

	}

}