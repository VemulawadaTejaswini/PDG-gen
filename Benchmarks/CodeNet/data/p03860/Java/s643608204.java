import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
        char[]ss = S.toCharArray();
        String A = sc.next();
        char[]a = A.toCharArray();
        String B = sc.next();
        char[]b = B.toCharArray();

			System.out.print(ss[0]);
			System.out.print(a[0]);
			System.out.println(b[0]);
		}
	}