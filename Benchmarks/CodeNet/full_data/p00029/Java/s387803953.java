import java.util.*;
import java.util.Map.Entry;
public class Main {
	HashMap<String, Integer> wordtmp;
	Scanner sc;
	void run() {
		sc = new Scanner (System.in);
		wordtmp = new HashMap<String, Integer>();
		while (sc.hasNext()) {
			String str = sc.next();
			String[] words = str.split(" ");
			for (int i=0;i<words.length;i++) {
				if (!wordtmp.containsKey(words[i]))
					wordtmp.put(words[i], 1);
				else {
					wordtmp.put(words[i], wordtmp.get(words[i])+1);
				}
			}
		}
		int c = 0;
		int len = 0;
		String str="";
		String strl="";
		
		for (Iterator it = wordtmp.entrySet().iterator();it.hasNext();) {
			Entry entry = (Entry)it.next();
			if ( c < (Integer)entry.getValue() ) {
				c = (Integer)entry.getValue();
				str = (String)entry.getKey();
			}
			if (len < entry.getKey().toString().length() ) {
				len = entry.getKey().toString().length();
				strl = entry.getKey().toString();
			}
		}
		System.out.println( str + " " + strl);
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
	
}