
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();
		int[] slist = new int[S.length()];
		int[] tlist = new int[T.length()];
		Map<Character, Integer> appear = new HashMap<>();
		int count = 0;
		for(int i = 0; i < S.length(); i++) {
			char tmp = S.charAt(i);
			if(appear.containsKey(tmp)) {
				slist[i] = appear.get(tmp);
			} else {
				appear.put(tmp, count);
				slist[i] = count;
				count++;
			}
		}
		appear.clear();
		count = 0;
		for(int i = 0; i < T.length(); i++) {
			char tmp = T.charAt(i);
			if(appear.containsKey(tmp)) {
				tlist[i] = appear.get(tmp);
			} else {
				appear.put(tmp, count);
				tlist[i] = count;
				count++;
			}
		}
		boolean ans = true;
		for(int i = 0; i < S.length(); i++) {
			ans = ans && slist[i] == tlist[i];
		}
		if(ans) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
