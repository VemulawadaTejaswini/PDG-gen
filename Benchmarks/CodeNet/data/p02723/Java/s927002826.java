import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner n = new Scanner(System.in);

		String S = n.next();

		String[] strArray = S.split("");

		if(strArray[2].equals(strArray[3]) && strArray[4].equals(strArray[5])) {
			System.out.println("Yes");

		}else {
			System.out.println("No");
		}
	}

}
