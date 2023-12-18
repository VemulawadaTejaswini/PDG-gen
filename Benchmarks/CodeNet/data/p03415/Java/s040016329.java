import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String[] str = new String[3];
		for(int i = 0; i < str.length; i++) {
			str[i] = scan.next();
		}
		for(int i = 0; i < str.length; i++) {
			System.out.print(str[i].charAt(i));
		}
	}
}