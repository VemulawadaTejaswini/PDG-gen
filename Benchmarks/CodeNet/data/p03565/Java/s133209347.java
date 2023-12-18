import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String Sd = scanner.nextLine();
		String T = scanner.nextLine();
		
		// char start = 
		
		if ( hasStr(Sd, T) ) {
			char start = T.charAt(0);
			
			char arr[] = new char[T.length()-1];
			java.util.Arrays.fill(arr, '?');
			String q = new String(arr);
			
			Sd = Sd.replace(String.valueOf(start)+q, T);
		}
		
		Sd = Sd.replace('?', 'a');
		
		System.out.println(Sd);
	}
	
	static boolean hasStr(String str, String T) {
		char c = T.charAt(0);
		int index =  str.indexOf(c);
		
		return str.length() > index + T.length() - 1;
	}
}
