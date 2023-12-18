import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

	Scanner sca = new Scanner(System.in);
	int n = sca.nextInt();
	String s = sca.next();
	String t = sca.next();
	char a;
	char b;

	StringBuilder sb = new StringBuilder("");


	for(int i = 0; i < n; i++) {
		a = s.charAt(i);
		b = t.charAt(i);
		sb.append(a);
		sb.append(b);
	}
	System.out.println(sb);

	sca.close();
	}
}