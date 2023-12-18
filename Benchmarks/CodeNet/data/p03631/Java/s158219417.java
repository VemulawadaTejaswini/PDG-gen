import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		StringBuffer sb = new StringBuffer(N);
		sb = sb.reverse();
		String revN = sb.toString();
		if(N.equals(revN)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		sc.close();
	}
}
