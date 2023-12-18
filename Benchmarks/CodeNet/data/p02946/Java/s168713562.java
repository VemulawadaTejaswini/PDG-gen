import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int x = sc.nextInt();
		sc.close();

		Set<String> ret = new TreeSet<>();
		for (int i=(x-k+1); i<(x+k); i++) {
			ret.add(String.valueOf(i));
		}

		System.out.println(String.join(" ", ret));
	}

}