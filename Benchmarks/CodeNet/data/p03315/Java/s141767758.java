import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String a = sc.next();

		int result = 0;

		for(int i = 0; i< a.length(); i++) {

			char c = a.charAt(i);

			if(c == '-') {
				result--;
			}else {
				result++;
			}
		}

		System.out.println(result);
	}
}