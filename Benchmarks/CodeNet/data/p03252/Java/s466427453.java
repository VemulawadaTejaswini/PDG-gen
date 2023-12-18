import java .util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		String T = sc.nextLine();
		
		Map<String, String> map = new HashMap<String, String>();
		for(int i = 0; i < S.length(); i++) {
			String str1 = S.substring(i, i + 1);
			String str2 = T.substring(i, i + 1);
			if(!map.containsKey(str2)) {
				map.put(str2, str1);
			} else {
				if(!map.get(str2).equals(str1)) {
					System.out.println("No");
					return;
				}
			}
		}
		
		System.out.println("Yes");
	}
}
