import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);


		String a = scan.next();
		String b = scan.next();
		String c = scan.next();

		String str = a.chatAt(0);
		str += b.charAt(0);
		str += c.charAt(0);

		System.out.println(str);
	}
}
