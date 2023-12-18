import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);


		String a = scan.next();
		String b = scan.next();
		String c = scan.next();

		String str = "";

		str = (a.chatAt(0) + b.chatAt(0) + c.chatAt(0)) + "";

		System.out.println(str);
	}
}
