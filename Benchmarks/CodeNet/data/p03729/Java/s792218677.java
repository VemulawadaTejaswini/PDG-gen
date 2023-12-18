import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a, b, c;
		char al, bf, bl, cf;
		
		a = sc.next();
		al = a.charAt(a.length() - 1);
		b = sc.next();
		bf = b.charAt(0);
		bl = b.charAt(b.length() - 1);
		c = sc.next();
		cf = c.charAt(0);
		sc.close();
		
		
		if(al == bf && bl == cf)System.out.println("YES");
		else System.out.println("NO");
	}

}
