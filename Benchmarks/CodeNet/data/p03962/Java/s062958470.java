import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		HashSet<String> set = new HashSet<String>();

		for(int idx = 0; idx < 3; idx++) {
			String num = sc.next();
			set.add(num);
		}

		System.out.println(set.size());
		
		sc.close();
	}

}