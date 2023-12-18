import java.util.Scanner;

public class Main {
	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		String b = sc.next();
		sc.close();
		if("A".equals(b)) System.out.println("T");
		else if("T".equals(b)) System.out.println("A");
		else if("C".equals(b)) System.out.println("G");
		else System.out.println("C");
	}
}