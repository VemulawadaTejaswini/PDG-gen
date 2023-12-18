import java.util.Scanner;
//import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		String c = scan.next();
		
		System.out.println(b.startsWith(a.charAt(a.length()-1).toString()) && c.startsWith(b.charAt(b.length()-1).toString()) ? "YES" : "NO");
	}
}
