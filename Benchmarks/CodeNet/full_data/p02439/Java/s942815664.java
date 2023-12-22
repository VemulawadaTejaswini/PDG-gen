import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = Integer.parseInt(in.next()), b = Integer.parseInt(in.next()), c = Integer.parseInt(in.next());
		System.out.println(Math.min(a, Math.min(b, c)) + " " + Math.max(a, Math.max(b, c)));
	}

}

