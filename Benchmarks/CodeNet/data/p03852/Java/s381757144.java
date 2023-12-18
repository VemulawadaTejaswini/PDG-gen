import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a=scan.next();
		if(a.equals("a")||a.equals("e")||a.equals("u")||a.equals("i")||a.equals("o")) {
			System.out.println("vowel");
		}
		else {
			System.out.println("consonant");
		}
	}
	}