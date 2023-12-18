import java.util.Scanner;

public class A_Haiku {
 	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(s.replace(',', ' '));
		sc.close();
	}
 }