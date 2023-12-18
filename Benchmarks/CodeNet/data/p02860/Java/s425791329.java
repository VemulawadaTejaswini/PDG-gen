import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		sc.close();

		if(n%2 == 1) {
			System.out.println("No");
			return;
		}

		String s1 = s.substring(0, n/2);
		String s2 = s.substring(n/2,n);

		if(s1.equals(s2)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
