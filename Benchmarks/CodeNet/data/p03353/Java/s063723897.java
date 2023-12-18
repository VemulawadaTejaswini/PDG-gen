
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int k = sc.nextInt();
		Set<String> sub = new HashSet<>();
		for(int i = 0; i < s.length(); i++) {
			sub.add(s.substring(i, i + 1));
			if(i + 1 < s.length())
				sub.add(s.substring(i, i + 2));
			if(i + 2 < s.length())
				sub.add(s.substring(i, i + 3));
			if(i + 3 < s.length())
				sub.add(s.substring(i, i + 4));
			if(i + 4 < s.length())
				sub.add(s.substring(i, i + 5));
		}
		List<String> list = new ArrayList<>();
		list.addAll(sub);
		Collections.sort(list);
		System.out.println(list.get(k - 1));
	}

}
