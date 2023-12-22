import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		String input = scan.nextLine();
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < input.length(); i++){
			char ch = input.charAt(i);
			if(ch.isLowerCase()){
				ch = ch.toUpperCase();
			} else if(ch.isUpperCase()){
				ch = ch.toLowerCase();
			}
			sb.append(ch);
		}
		String output = sb.toString();
		System.out.println(output);
	}
}