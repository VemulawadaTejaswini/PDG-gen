import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		String input = scan.next();
		int h = scan.nextInt();
		for(int i = 0; i < h; i++){
			int m = scan.nextInt();
			String s = input.substring(0, m);
			String s2 = input.substring(m);
	 		StringBuffer sb = new StringBuffer();
			sb.append(s2).append(s);
			input = sb.toString();
		}
		System.out.println(input);
	}
}