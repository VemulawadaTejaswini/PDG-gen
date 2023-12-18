
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String x = sc.next();
		boolean flag = true;
		Set<Character> set = new HashSet<>();
		for(int i = 0; i < 4; i++) {
			if(set.contains(x.charAt(i))) {
				flag = false;
				break;
			} else {
				set.add(x.charAt(i));
			}
		}
		if(flag) {
			System.out.println("Good");
		} else {
			System.out.println("Bad");
		}
	}

}
