import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String ABC = "ABC";
		String ARC = "ARC";
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		if (ABC.equals(s)) {
			System.out.println(ARC);
		} else {
			System.out.println(ABC);
		}
	}
}