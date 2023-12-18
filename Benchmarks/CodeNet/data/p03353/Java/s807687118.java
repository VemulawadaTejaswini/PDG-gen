import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int K = sc.nextInt();
		
		TreeSet<String> S = new TreeSet<>();
		
		String[] t = s.split("");
		Arrays.sort(t);
		
		for(int i = 0; i < t.length; i++) {
			int x = s.indexOf(t[i]);
			int y = 0;
			while(x != -1) {
				for(int j = x; j < s.length(); j++) {
					for(int k = j; k < s.length(); k++) {
						S.add(s.substring(j, k + 1));
					}
				}
				y++;
				x = s.indexOf(t[i], y);
			}
			if(S.size() >= K) {
				break;
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
