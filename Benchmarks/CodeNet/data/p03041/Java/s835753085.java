import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
		String s = sc.next();
		sc.close();
		sc = null;
		System.out.println(s.substring(0, k-1) + s.substring(k-1, k).toLowerCase() + s.substring(k));
	}
}
