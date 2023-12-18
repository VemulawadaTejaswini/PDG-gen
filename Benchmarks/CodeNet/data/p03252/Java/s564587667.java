import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		boolean b = true;
		for(char c = 'a'; c <= 'z' && b; c++) {
			final char character = c;
			List<Integer> charAt = new ArrayList<>();
			for(int i = 0; i < t.length(); i++)
				if(c == t.charAt(i))
					charAt.add(i);
			if(charAt.size() > 1) 
				b &= charAt.stream().map(i -> s.charAt(i)).collect(Collectors.toSet()).size() == 1;
		}
		System.out.println(b ? "Yes" : "No");
	}
}
