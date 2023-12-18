import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String a = s.nextLine();
		String b ="";
		if(a.equals("a")) {
			b="vowel";
		}else if(a.equals("i")) {
			b="vowel";
		}else if(a.equals("u")) {
			b="vowel";
		}else if(a.equals("e")) {
			b="vowel";
		}else if(a.equals("o")) {
			b="vowel";
		}else {
			b="consonant";
		}

		System.out.println(b);

	}

}
