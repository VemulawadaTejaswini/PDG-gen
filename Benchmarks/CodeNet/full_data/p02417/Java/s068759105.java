import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		int[] alphabet = new int[26];
		char a = 'a';

		for(int i=0; i<str.length(); i++){
			if(Character.isUnicodeIdentifierStart(str.charAt(i))){
				int num = Character.toLowerCase(str.charAt(i)) - 'a';
				alphabet[num]++;
			}
		}
		for(int i=0; i<alphabet.length; i++){
			System.out.println(a++ + " : " + alphabet[i]);
		}
	}

}