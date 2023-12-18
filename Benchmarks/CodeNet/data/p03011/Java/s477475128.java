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
		int d=a+b;
		h.add(d);
		int e=b+c;
		h.add(e);
		int h1=c+a;
		h.add(h1);
		System.out.println(Collections.min(h));
		

	}

}
