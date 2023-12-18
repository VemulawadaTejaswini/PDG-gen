import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 1000000007;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;


	void doIt() {
		Set<Character> odd = new HashSet<>();
		Set<Character> even = new HashSet<>();
		odd.add('R');odd.add('U');odd.add('D');
		even.add('L');even.add('U');even.add('D');
		String s = sc.next();
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(i % 2 == 0) {
				if(!odd.contains(c)) {
					System.out.println("No");
					return;
				}
			}
			else {
				if(!even.contains(c)) {
					System.out.println("No");
					return;
				}
			}
		}
		System.out.println("Yes");
	}


	public static void main(String[] args) {
		new Main().doIt();
	}
}
