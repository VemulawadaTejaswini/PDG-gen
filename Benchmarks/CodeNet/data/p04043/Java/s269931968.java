import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Set<Integer> list = new HashSet<>();

		for(int i=0; i<3; i++) {
			list.add(scanner.nextInt());
		}

		if(list.contains(7) && list.contains(5)) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	    scanner.close();
		}
}
