import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s=scan.nextLine();
		HashMap<Character, Integer> h = new HashMap<Character, Integer>();
		for(int i=0;i<s.length();i++) {
			if(h.containsKey(s.charAt(i))==false) {
				h.put(s.charAt(i), 1);
			}
			else {
				int old=h.get(s.charAt(i));
				int b=old+1;
				h.put(s.charAt(i),b);
			}
		}
		Set<Map.Entry<Character, Integer>> hmap= h.entrySet();
		for (Map.Entry<Character, Integer> data : hmap) {
			if(data.getValue()>=3) {
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");
	}

}
