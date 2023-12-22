import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new java.util.Scanner(System.in);
		String s, p;

		s = sc.next();
		p = sc.next();

		if ((s+s).contains(p)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}

