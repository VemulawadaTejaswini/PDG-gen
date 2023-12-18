import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int seisu = scan.nextInt();
		String mozi = scan.next();

		System.out.println(seisu>=3200?mozi:"red");

		scan.close();

	}

}
