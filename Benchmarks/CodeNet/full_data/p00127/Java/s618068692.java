/**
 * @author yuichirw
 *
 */

import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static String line;
	static String convert = "abcdefghijklmnopqrstuvwxyz.?! ";

	static boolean read() {
		if(!sc.hasNextLine()) return false;
		line = sc.nextLine();
		return true;
	}
	
	static String solve() {
		if(line.length() % 2 == 1) return "NA";
		
		int fst, snd;
		String res = "";
		for(int i = 0; i < line.length(); i += 2) {
			fst = line.charAt(i) - '0';
			snd = line.charAt(i+1) - '0';
			
			res += convert.charAt((fst - 1) * 5 + (snd - 1));
		}
		return res;
	}
	
	public static void main(String[] args) {
		while(read()) {
			System.out.println(solve());
		}
		System.out.println("END");
	}

}