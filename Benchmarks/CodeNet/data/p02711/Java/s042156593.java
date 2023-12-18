import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		String n = kb.next();
		char p = n.charAt(n.length() - 1);
		//System.out.println(p);
		if (p == '7') {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		kb.close();
	}

}
