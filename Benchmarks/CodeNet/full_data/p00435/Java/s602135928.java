import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		
		String decode = "";
		
		for(int i = 0; i < str.length(); i++) {
			decode+=String.valueOf((char)(str.charAt(i) - 3));
		}
		
		System.out.println(decode);
	}
}