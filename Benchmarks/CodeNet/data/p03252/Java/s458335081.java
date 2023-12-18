import java .util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		String T = sc.nextLine();
		
		Map<String, String> map1 = new HashMap<String, String>();
		Map<String, String> map2 = new HashMap<String, String>();
		for(int i = 0; i < S.length(); i++) {
			String str1 = S.substring(i, i + 1);
			String str2 = T.substring(i, i + 1);
			if(!map1.containsKey(str1) && !map2.containsKey(str2)) {
				map1.put(str1, str2);
				map2.put(str2, str1);
			} else {
				if(!map1.get(str1).equals(str2) || !map2.get(str2).equals(str1)) {
					System.out.println("No");
					return;
				}
			}
		}
		
		System.out.println("Yes");
	}
}
