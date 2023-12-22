import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String noun = sc.next();
		int len = noun.length();
		if(noun.charAt(len - 1) == 's') {
			System.out.println(noun+"es");
		} else {
			System.out.println(noun+"s");
		}
	}
}
