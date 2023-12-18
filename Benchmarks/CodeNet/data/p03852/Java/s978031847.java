import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		char[] vowel = new char[] {'a', 'i', 'u', 'e', 'o'};
		Scanner scan = new Scanner(System.in);
		String letter = scan.next();
		char[] letterc = letter.toCharArray();

		for(int i = 0; i<vowel.length; i ++){
			if(vowel[i]== letterc[0]){
				 System.out.println("vowel");
				 break;
			}else{
				 System.out.println("consonant");
				 break;
			}
		}

	}

}
