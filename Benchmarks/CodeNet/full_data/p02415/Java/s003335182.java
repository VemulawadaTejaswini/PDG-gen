import java.util.*;

public class Main{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		StringBuilder sb = new StringBuilder();
		String s = null;
		String t = null;
		for(int i = 0; i < str.length(); i++){
			if(Character.isUpperCase(str.charAt(i))){
				s = String.valueOf(str.charAt(i)).toLowerCase();
			} else if(Character.isLowerCase(str.charAt(i))){
				s = String.valueOf(str.charAt(i)).toUpperCase();
			}
			sb.append(s);
		}
		t = sb.toString();
		System.out.println(t);
	}
}