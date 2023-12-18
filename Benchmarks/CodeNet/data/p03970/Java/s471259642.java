import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String original = "CODEFESTIVAL2016";
		int num = 0;
		for (int i = 0; i < original.length(); i++) {
			if(S.charAt(i) != original.charAt(i))
				num ++;
		}
		System.out.println(num);

	}

}