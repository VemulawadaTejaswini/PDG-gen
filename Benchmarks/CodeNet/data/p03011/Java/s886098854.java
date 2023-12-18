import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		HashSet h=new HashSet();
		a=a+b;
		h.add(a);
		b=b+c;
		h.add(b);
		c=c+a;
		h.add(c);
		System.out.println(Collections.min(h));
		

	}

}
