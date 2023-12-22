import java.util.Scanner;

public class Main {
	static Scanner src = new Scanner(System.in);
	public static void main(String[] args) {
		String str1 = new String();
		String str2 = new String();
		str1 = src.next();
		str2 = src.next();
		if(str2.substring(0, str2.length() - 1).equals(str1)) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
}
