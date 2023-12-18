import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		String s = sc.next();
		if(s.charAt(A)!='-') {
			System.out.println("No");
			return ;
		}
		for (int i=0;i<s.length();i++) {
			if (i!=A) {
				if (s.charAt(i)<'0'||s.charAt(i)>'9') {
					System.out.println("No");
					return ;
				}
			}
		}
		System.out.println("Yes");
		return ;
	}
}