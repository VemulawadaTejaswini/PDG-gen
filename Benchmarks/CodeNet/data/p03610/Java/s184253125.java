import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		String s = stdIn.next();
		char[] words = s.toCharArray();
		for(int i = 0; i < s.length(); i += 2) {
			System.out.print(words[i]);
		}

	}

}