import java.util.*;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String[] words = sc.nextLine().split(" ");
		TreeMap<String, Integer> dic = new TreeMap<String, Integer>();
		String mode = "", longest = "";
		int max = 0, maxlen = 0;
		for(int i = 0; i < words.length; i++) {
			int cnt = 1;
			String key = words[i];
			if(dic.containsKey(key)) {
				cnt = dic.get(words[i]);
				dic.remove(words[i]);
			}
			dic.put(key, ++cnt);
			if(max < cnt) {
				max = cnt;
				mode = key;
			}
			if(maxlen < key.length()) {
				maxlen = key.length();
				longest = key;
			}
		}
		System.out.println(mode + " " + longest);
	}

}