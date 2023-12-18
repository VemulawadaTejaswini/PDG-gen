import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String b = sc.next();

		if (b.equals("A")) {
			System.out.println("T");
		}else if(b.equals("T")) {
			System.out.println("A");
		}
		if (b.equals("C")) {
			System.out.println("G");
		}else if(b.equals("G")) {
			System.out.println("C");
		}
	}
}
