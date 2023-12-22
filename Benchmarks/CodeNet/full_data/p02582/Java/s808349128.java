import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String string = sc.next();
		int con = 0;
		int max = 0;

		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == 'R') {
				con++;
				if (max <con) {
					max = con;
				}
			}else {
				con = 0;
			}
		}
		System.out.println(max);

	}
}