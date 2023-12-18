import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		char[] words = {'a','i','u','e','o'};
		char a = sc.next().charAt(0);
		String answer = "consonant";
		for(int i=0; i<5; i++) {
			if(a == words[i]) {
				answer = "vowel";
				break;
			}
		}
		System.out.println(answer);
	}
}