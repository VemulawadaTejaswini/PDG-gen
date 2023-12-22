import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String args[]) {
		while(sc.hasNext()) {
			int n = sc.nextInt();
			System.out.println(n * (n + 1) / 2 + 1);
		}
	}
}