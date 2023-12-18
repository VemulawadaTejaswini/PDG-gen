import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = sc.nextInt();
		boolean reverse = false;
		for (int i = 0; i < n; i++) {
			int q = sc.nextInt();
			if(q == 1) {
				reverse = !reverse;
			} else {
				int q2 = sc.nextInt();
				if((!reverse && q2 == 1) || (reverse && q2 == 2)) {
					s = sc.next() + s;
				} else {
					s = s + sc.next(); 
				}
			}
			System.out.println(s);
		}
		if(reverse) System.out.println(new StringBuilder(s).reverse().toString());
		else System.out.println(s);
	}
}
