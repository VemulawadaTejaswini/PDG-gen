import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		String s = sc.next();
		boolean flag = true;

		for(int i = 0; i < a; i++) {
			int c = s.charAt(i);
			if(c < 48 || c > 57) flag = false;
		}

		if(s.charAt(a) != '-') flag = false;

		for(int i = a+1; i < a+b+1; i++) {
			int c = s.charAt(i);
			if(c < 48 || c > 57) flag = false;
		}
		System.out.println(flag ? "Yes" : "No");
		sc.close();
	}
}