import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		
		int max = 0;
		for (int i = 1; i < n - 1; i++) {
			String x = s.substring(0, i);
			String y = s.substring(i);
			
			Set<Character> setX = new HashSet<>();			
			Set<Character> setY = new HashSet<>();			
			
			for (int j = 0; j < x.length(); j++) {
				setX.add(x.charAt(j));
			}
			
			for (int j = 0; j < y.length(); j++) {
				setY.add(y.charAt(j));
			}
			
			int cnt = 0;
			for (char c : setX) {
				if (setY.contains(c)) cnt++;
			}
			
			max = Math.max(max, cnt);
		}
		
		System.out.println(max);
		
		sc.close();
	}
}


