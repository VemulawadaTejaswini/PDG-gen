import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s = input.next();
		boolean valid = true;
		if (s.length()%2==1) valid = false;
		else {
			for (int i = 0; i < s.length()-1; i+=2) {
				if (s.charAt(i)!='h'||s.charAt(i+1)!='i') {
					valid = false;
					break;
				}
			}
		}
		System.out.println(valid? "Yes": "No");
	}
}