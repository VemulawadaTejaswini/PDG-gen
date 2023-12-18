import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		if(s.charAt(s.length())==s.charAt(0) && s.length()%2==0)System.out.println("Second");
		else if(s.charAt(s.length())!=s.charAt(0) && s.length()%2!=0)System.out.println("Second");
		else System.out.println("First");
	}
}
	