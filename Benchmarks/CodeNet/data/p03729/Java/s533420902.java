import java.util.Scanner;
//import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		String c = scan.next();
		
		System.out.println(a.substring(a.length()-1).equals(b.substring(0,1)) && b.substring(b.length()-1).equals(c.substring(0,1)) ? "YES" : "NO");
	}
}
