import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int s = sc.nextInt();
		Set<Integer> sSet = new HashSet<Integer>();

		while(!sSet.contains(s)) {
			sSet.add(s);

			if(s % 2 == 0) {
				s = s/2;
			} else {
				s = 3*s + 1;
			}
		}

		System.out.println(sSet.size() + 1);

	}

}

