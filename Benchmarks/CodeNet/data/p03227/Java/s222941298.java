import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();
		StringBuilder sb = new StringBuilder(S);
		if(S.length() == 2) {
			System.out.println(S);
		}else {
			System.out.println(sb.reverse());
		}
	}
}