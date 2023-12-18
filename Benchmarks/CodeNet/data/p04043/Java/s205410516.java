import java.util.*;

// UVa 11504

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		
		if ((a == 7 && b == 5 && c == 5) || (a == 5 && b == 7 && c == 5) || (a == 5 && b == 5 && c == 7)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}