import java.util.Scanner;

public class Main {
	//java11

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s = sc.next();

		if(s.charAt(1) == 'B')
			s = "ARC";
		else
			s = "ABC";

		System.out.println(s);

	}

}
