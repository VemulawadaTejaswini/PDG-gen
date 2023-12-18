import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		sc.close();
		
		if(str1.charAt(0) == str2.charAt(2)
				&& str1.charAt(1) == str2.charAt(1)
				&& str1.charAt(2) == str2.charAt(0)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
