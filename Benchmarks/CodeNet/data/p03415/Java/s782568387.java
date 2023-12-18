import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String b = sc.nextLine();
		String c = sc.nextLine();
		char al = a.charAt(0);
		char bl = b.charAt(1);
		char cl = c.charAt(2);
		String ax = String.valueOf(al);
		String bx = String.valueOf(bl);
		String cx = String.valueOf(cl);
		
		
		System.out.println(ax+bx+cx);
		sc.close();
	}
}
