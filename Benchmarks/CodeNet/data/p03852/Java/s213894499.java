import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		
		String s=stdIn.next();
		
		if(s=="a" || s=="e" || s=="i" ||s=="o" || s=="u")
			System.out.println("vowel");
		else
			System.out.println("consonant");

	}

}
