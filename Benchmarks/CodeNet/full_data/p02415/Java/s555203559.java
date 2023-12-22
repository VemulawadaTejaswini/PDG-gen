import java.util.*;
class Main { 
	public static void main(String...args){
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String uStr = str.toUpperCase();
		String[] chars = str.split("");
		String[] uChars = uStr.split("");
		StringBuilder sb = new StringBuilder();

		for(int i = 0; i < chars.length; i++){
			if(chars[i].equals(uChars[i])) {
				sb.append(chars[i].toLowerCase());
			} else {
				sb.append(chars[i].toUpperCase());
			}
		}
		System.out.println(sb.toString());
	}
}
