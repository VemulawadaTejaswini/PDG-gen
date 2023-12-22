import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		if(t.startsWith(t) &&  t.length()-1==s.length())  System.out.println("Yes");
		else System.out.println("No");
	}
}