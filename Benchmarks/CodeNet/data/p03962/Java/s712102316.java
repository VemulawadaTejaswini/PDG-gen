import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Set<Integer> set = new HashSet<Integer>();
		set.add(scan.nextInt());
		set.add(scan.nextInt());
		set.add(scan.nextInt());
		System.out.println(set.size());
	}
}