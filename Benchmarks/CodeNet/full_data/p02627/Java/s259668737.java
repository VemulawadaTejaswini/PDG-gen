import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		if (s.toUpperCase().equals(s)) {
			System.out.println("A");
		} else {
			System.out.println("a");
		}
	}

}
