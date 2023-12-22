import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	static String reverse(String s) {
		return new StringBuilder(s).reverse().toString();
	}
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int m = sc.nextInt();
			for(int i=1; i<=m; i++) {
				String s = sc.next();
				TreeSet<String> p = new TreeSet<>();
				for(int j=0; j<s.length()-1; j++) {
					String f = reverse(s.substring(0, j+1));
					String t = reverse(s.substring(j+1));
					p.add(reverse(f) + t);
					p.add(t + reverse(f));
					p.add(reverse(t) + f);
					p.add(f + reverse(t));
					p.add(f + t);
					p.add(t + f);
					p.add(reverse(f) + reverse(t));
					p.add(reverse(t) + reverse(f));
				}
				System.out.println(p.size());
			}
		}
	}
}
