import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		switch (str) {
		case "A":
			System.out.println("T");
			break;
		case "C":
			System.out.println("G");
			break;
		case "T":
			System.out.println("A");
			break;
		case "G":
			System.out.println("C");
			break;

		default:
			break;
		}
	}
}
