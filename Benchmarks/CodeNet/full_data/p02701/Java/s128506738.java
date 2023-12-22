import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		HashSet<String> present = new HashSet<String>();

		for(int i = 0;i < n;i++) {
			present.add(scan.next());

		}

		System.out.println(present.size());
	}
}