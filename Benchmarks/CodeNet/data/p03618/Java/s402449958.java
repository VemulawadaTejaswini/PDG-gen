import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		
		ArrayList<String> r = new ArrayList<String>();
		r.add(a);
		
		for(int i = 0; i < a.length()-1; i++) {
			for(int j = i+1; j < a.length(); j++) {
				String str = reverse(a, i, j);
				if(!r.contains(str)) {
				r.add(str);
				}
				
			}
		}
		
		System.out.println(r.size());
		
	}
	
	static private String reverse(String str, int start, int end) {
		StringBuffer sb = new StringBuffer();
		
		if(start >= 1) {
			sb.append(str.substring(0, start));
		}
		
		
		for(int i = end; i >= start; i--) {
			sb.append(str.charAt(i));
		}
		
		if(end < str.length()-1) {
		sb.append(str.substring(end+1));
		}
		
		return sb.toString();
		
	}

}
