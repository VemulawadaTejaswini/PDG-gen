import java.util.Scanner;

public class Main {
	public static void main (String args[]) {
		Scanner scan = new Scanner(System.in);
		String c = scan.next();
		String s[] = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		
		for(int i = 0; i < s.length; i++) {
			if(s[i].equals(c)) {
				System.out.println(s[i+1]);
				return;
			}
		}
	}
}