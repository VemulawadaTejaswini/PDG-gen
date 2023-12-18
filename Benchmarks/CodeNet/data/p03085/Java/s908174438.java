import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		if (n == "A")
			System.out.println("T");
		else if (n == "T")
			System.out.println("A");
		else if (n == "G")
			System.out.println("C");
		else if (n == "C")
			System.out.println("G");
	}

}