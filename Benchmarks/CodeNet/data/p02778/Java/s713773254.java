import java.util.Scanner;

public class Main {
	public static void main (String args[]) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();

		String str = "x";
		for(int i = 0; i < s.length()-1;i++){
			str = str + "x";
		}
		System.out.println(str);
	}
}