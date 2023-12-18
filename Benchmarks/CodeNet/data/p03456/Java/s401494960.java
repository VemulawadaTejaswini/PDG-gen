import java.util.Scanner;
 
 
 
public class Main {
 
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
 
		String a = s.next();
		String b = s.next();
 
		int x = Integer.parseInt(a+b);
		int r = (int)Math.sqrt(x);
		System.out.println(x == r *  r ? "Yes":"No");
	}
 
}
