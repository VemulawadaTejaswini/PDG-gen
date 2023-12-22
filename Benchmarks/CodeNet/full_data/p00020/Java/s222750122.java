import java.util.Scanner;
import java.util.ArrayList;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<String> str = new ArrayList<String>();
		
		boolean flag = false;
		
		while( true ) {
			String temp = scan.next();
			String s = new String();
			char[] c = new char[temp.length()];
			for(int i = 0; i < temp.length(); i++) {
				c[i] = temp.charAt(i);
				
				if(c[i] == '.') {
					flag = true;
				}
				
				if( Character.isLowerCase(c[i]) ) {
					c[i] = Character.toUpperCase(c[i]);
				}
				s = s.concat(Character.toString(c[i]));
			}
			str.add(s);
			
			if(flag == true) {
				break;
			}
		}
		
		for(int i = 0; i < str.size(); i++) {
			if(i < (str.size() - 1) ) {
				System.out.print(str.get(i) + " ");
			}
			
			else {
				System.out.println(str.get(i));
			}
		}
	}
}