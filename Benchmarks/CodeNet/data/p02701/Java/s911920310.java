import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		HashSet<String> set = new HashSet<>();

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			String prize = sc.next();
			set.add(prize);
		}
		sc.close();

		print(set.size());
	}

	public static void print(Object obj) {
		System.out.println(obj);
	}

}
