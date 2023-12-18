
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		StringBuilder sb = new StringBuilder();
		sb.append(2018);
		sb.append(S.substring(4,10));
		
		System.out.println(sb.toString());
		
	}
}
