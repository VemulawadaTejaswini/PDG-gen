import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String ans = "";
		for(int i = 0; i < a.length(); i = i + 2) {
			String b = "";
			b = a.charAt(i) + ans;
			System.out.print(b);
		}
		
	}
}