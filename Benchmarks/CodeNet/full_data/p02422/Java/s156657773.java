import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, q, a, b, r, len;
		String str, com, p, s1, s2, s3;
		str = sc.next();
		q = sc.nextInt();
		
		for (i = 0; i < q; i++) {
			com = sc.next();
			
			switch (com) {
			
			case ("print"):
				a = sc.nextInt();
				b = sc.nextInt();
				s1 = str.substring(a, b + 1);
				System.out.println(s1);
				break;
				
			case ("reverse"):
				a = sc.nextInt();
				b = sc.nextInt();
				s1 = str.substring(0, a);
				s2 = str.substring(a, b + 1);
				s3 = str.substring(b + 1);
				len = s2.length();
				
				for (r = len - 1; r >= 0; r--) {
					s1 += s2.substring(r, r + 1);
				}
				str = s1 + s3;
				break;
				
			case ("replace"):
				a = sc.nextInt();
				b = sc.nextInt();
				p = sc.next();
				s1 = str.substring(0, a);
				s2 = str.substring(a, b + 1);
				s3 = str.substring(b + 1);
				str = s1 + p + s3;
				break;
			default:
				break;
			}
		}
	}
}

