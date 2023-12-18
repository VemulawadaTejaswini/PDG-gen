import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int l = scan.nextInt();
		Set<String> set = new TreeSet<String>();
		for(int i = 0; i < n; i++) {
			set.add(scan.next());
		}
		for(String s:set) {
			System.out.print(s);
		}
		System.out.println();
	}
}