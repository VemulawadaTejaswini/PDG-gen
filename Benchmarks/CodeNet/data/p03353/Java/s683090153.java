import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int K = sc.nextInt();
		
		TreeSet<String> S = new TreeSet<>();
		
		for(int i = 0; i < s.length(); i++) {
			for(int j = i; j < s.length(); j++) {
				S.add(s.substring(i, j + 1));
			}
		}
		
		int a = 0;
		
		for(String i : S) {
			a++;
			if(a == K) {
				System.out.println(i);
			}
		}
	}
}
