import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		String str = sc.next();
		boolean ok = true;
		ok &= str.indexOf("##") == -1;
		if(c > d) {
			ok &= str.indexOf("...") != -1;
		}
		System.out.println(ok ? "Yes" : "No");
	}
}