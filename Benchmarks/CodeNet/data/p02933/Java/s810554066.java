import java.util.*;
public class Main {
	Scanner sc;
	int a;
	String s;

	public Main() {
		sc = new Scanner(System.in);
	}
	
	private void calc() {
		a = sc.nextInt();
		s = sc.next();
		
		if (a < 3200) System.out.println("red");
		else System.out.println(s);
		System.out.flush();
	}

	public static void main(String[] args) {
		new Main().calc();
	}

}