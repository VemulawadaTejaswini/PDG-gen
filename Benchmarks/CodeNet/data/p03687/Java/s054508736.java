import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		int N = s.length;
		
		for(int i=1; i<=N; i++) {
			HashSet<Character> set = new HashSet<>();
			for(int j=0; j<=N-i; j++) {
				HashSet<Character> next = new HashSet<>();
				for(int k=0; k<i; k++) {
					if(j==0 || set.contains(s[j+k]))
						next.add(s[j+k]);
				}
				set = next;
			}
			if(!set.isEmpty()) {
				System.out.println(i-1);
				break;
			}
		}
		
		sc.close();
	}
}
