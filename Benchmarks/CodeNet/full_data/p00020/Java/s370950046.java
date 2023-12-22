import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		
		String line = scan.nextLine();
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < line.length(); i++){
			char ch = line.charAt(i);
			if(Character.isLowerCase(ch)){
				ch = Character.toUpperCase(ch);
			}
			sb.append(ch);
		}
		String out = sb.toString();
		System.out.printf("%s\n", out);
	}
}