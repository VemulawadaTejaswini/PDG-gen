import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		in.close();
		if (N == 3) {
			System.out.println("Yes");
			System.out.println(3);
			System.out.println("2 1 2");
			System.out.println("2 1 3");
			System.out.println("2 2 3");
		} else {
			System.out.println("No");
		}
	}

}