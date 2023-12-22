import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		if(t.substring(0, t.length()-1).equals(s)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}