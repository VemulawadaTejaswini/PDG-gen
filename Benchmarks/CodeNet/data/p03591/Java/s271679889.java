import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String present = sc.next();
		if(present.startsWith("YAKI")) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
