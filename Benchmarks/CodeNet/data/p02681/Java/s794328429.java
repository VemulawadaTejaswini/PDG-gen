import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		boolean is = true;
		for (int i = 0; i < s.length(); i++) {
		    if (s.charAt(i) != t.charAt(i)) {
		        is = false;
		        break;
            }
        }
		if (is) System.out.println("Yes");
		else System.out.println("No");
		
	}
}