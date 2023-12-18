import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		for(int i = 0; i < s.length(); i+=2) {
			System.out.print(s.substring(i, i + 1));
		}
		scan.close();
	}

}
