import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
		
		for (int i = 0; i < n; i++)
			sc.next();
		
		System.out.println(n / (k - 1));
	}
}