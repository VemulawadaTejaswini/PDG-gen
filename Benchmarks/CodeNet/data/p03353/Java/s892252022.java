import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();
		int K = sc.nextInt();

		List<String> sub = new ArrayList<>();


		for(int i=0;i<s.length();i++) {
			for(int j=i;j<=s.length();j++) {
				String temp = s.substring(i, j);
				if(!sub.contains(temp)) {
					sub.add(temp);
				}
			}
		}

		Collections.sort(sub);

		System.out.println(sub.get(K));
	}
}
