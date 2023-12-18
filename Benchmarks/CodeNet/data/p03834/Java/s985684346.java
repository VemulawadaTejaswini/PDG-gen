import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String moji = sc.next();
		//String moji2 = moji.replaceAll(","," ");

		System.out.println(moji.replaceAll(","," "));

		sc.close();
	}

}
