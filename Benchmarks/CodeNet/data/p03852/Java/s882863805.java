import java.util.Scanner;

public class Main {
	public static void main(String[]args){
		
		Scanner scan = new Scanner(System.in);
		String moji = scan.next();
		
		
		switch(moji){
		case"a":			
			System.out.println("vowel");
			break;
		case"i":
			System.out.println("vowel");
			break;
		case"u":			
			System.out.println("vowel");
			break;
		case"e":			
			System.out.println("vowel");
			break;
		case"o":			
			System.out.println("vowel");
			break;
		default:			
			System.out.println("consonant");
			
		}
		
	}

}
