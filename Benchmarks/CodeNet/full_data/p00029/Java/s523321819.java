import java.util.*;
public class Main {
	HashMap<String, Integer> word;
	Scanner sc;
	void run() {
		sc = new Scanner(System.in);
		word = new HashMap<String, Integer>();
		while (sc.hasNext()) {
			String[] words = sc.next().split(" ");
			for (String str : words) {
				if (!word.containsKey(str)) 
					word.put(str, 1);
				else word.put(str, word.get(str)+1);
			}
		}
		String str = "";
		String strl = "";
		int count=0;
		for (Map.Entry<String, Integer> entry: word.entrySet()) {
			if (strl.length() < entry.getKey().length())strl = entry.getKey();
			if (count < entry.getValue()) {
				count = entry.getValue();
				str = entry.getKey();
			}
		}
		System.out.println(str + " " + strl);
		
	}
	public static void main(String[] args) {
		new Main().run();
	}
}