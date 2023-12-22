import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		String src = sca.next();
		if(src.equals("ABC")) {
			System.out.println("ARC");
		}
		else if(src.equals("ARC")) {
			System.out.println("ABC");
		}

		// 後始末
		sca.close();
	}
}