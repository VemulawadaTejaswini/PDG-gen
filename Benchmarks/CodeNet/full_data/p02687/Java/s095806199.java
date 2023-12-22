import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String S=scan.nextLine();
		String a="ABC";
		String b="ARC";
		if(S.equals(a))
		{
			System.out.println(b);
		}
		else
		{
			System.out.println(a);
		}
	}
}
