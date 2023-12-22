import java.util.*;
import java.io.*;
import java.math.*;
public class Main {
	static int max;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		HashMap<String,Boolean> use = new HashMap<String,Boolean>();
		char pre = 'a';
		while(true) {
			char say = 'a' -1;
			for(int i = 0; i < 26; i++) {
				say = (char)(say + 1);
				if(!use.containsKey(pre + "" + say + "" + 'a')) break;
			}
			char say2 = 'a';
			boolean f = false;
			if(use.containsKey(pre + "" + say + "" + 'a')) {
				f = true;
				for(int i = 0; i < 26; i++) {
					say2 = (char)(say2 + 1);
					if(!use.containsKey(pre + "" + say + "" + say2+ "" + 'a')) break;
				}
			}
			String aa = pre + "" + say + "" + 'a';
			if(f) {
				aa = pre + "" + say + "" + say2+ "" + 'a';
			}
			
			use.put(aa, true);
			
			System.out.println("?" + pre + "" + say + "" + "a");
			
			String get = sc.next();
			if(get.charAt(0) != 'a' || use.containsKey(get) || get.length() >= 3) {
				System.out.println("!OUT");
				return;
			}
			pre = get.charAt(get.length()-1);
			use.put(get, true);
		}
		
		
		
		
	}
}