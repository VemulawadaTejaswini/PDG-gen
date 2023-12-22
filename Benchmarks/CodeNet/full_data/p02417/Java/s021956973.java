import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine().toLowerCase();
		int[] alpha = new int[26];
		for(int i = 0; i < str.length(); i++){
			if(Character.isLowerCase(str.charAt(i))){
				alpha[str.charAt(i) - (int)'a']++;
			}
		}
		for(int i = 0; i < 26; i++){
			System.out.println((char) ('a' + i) + " : " + alpha[i]);
		}

	}

}