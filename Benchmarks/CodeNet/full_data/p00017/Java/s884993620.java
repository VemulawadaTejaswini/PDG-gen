
import java.util.Scanner;


public class Main{
	
	public static void main(String[] args){

		
		Scanner sc = new Scanner(System.in);
		String str = null;
		while(sc.hasNext()){
			str = sc.nextLine();
			String result = str;
			for(int i = 0; i < 27; i++){
				result = shiftString(i, str);
				if(strContainsKeywords(result, "the", "this", "that")) break;
			}
			System.out.println(result);
		}
		sc.close();
	}
	
	static String shiftString(int shift, String str) {
		char[] result = str.toCharArray();
		for(int i = 0; i < result.length; i++) {
			if(result[i] != '.' && result[i] != ' ' && result[i] != '\n') {
				if(result[i] + shift >= 'a' && result[i] + shift <= 'z') result[i] += shift;
				else if(result[i] + shift < 'a') result[i] = (char) ('z' + 1 - 'a' + result[i] + shift);
				else result[i] = (char) ('a' - 1 - 'z' + result[i] + shift);
			}
		};
		return new String(result);
	}
	
	static boolean strContainsKeywords(String str, String... keys) {
		boolean result = false;
		for(String s: keys) if(str.contains(s)) result = true;
		return result;
	}
}