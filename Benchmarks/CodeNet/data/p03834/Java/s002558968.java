import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		StringBuilder s=new StringBuilder(scan.nextLine());
		s.setCharAt(5,' ');		s.setCharAt(13,' ');
		System.out.println(s);
	}

}
