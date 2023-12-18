import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0, z = 0;
		String s = sc.next();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'A') {
				a = i;
				break;
			}
		}
		for (int j = a+1; j < s.length(); j++) {
			if (s.charAt(j) == 'Z') z = j;
		}
		System.out.println(z - a + 1);
	}

}