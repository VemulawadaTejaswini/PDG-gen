import java.io.ByteArrayInputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	
	String INPUT = "";
	
	public static void main(String[] args) throws Exception {
		new Main().run();
	}
	
	void run() {
		Scanner sc = INPUT.isEmpty() ? new Scanner(System.in) : new Scanner(new ByteArrayInputStream(INPUT.getBytes()));
		PrintWriter out = new PrintWriter(System.out);
		
		solve(sc, out);
		out.flush();
	}
	
	void solve(Scanner sc, PrintWriter out) {
		int a,b;
		String op;
		
		a = sc.nextInt();
		op = sc.next();
		b = sc.nextInt();
		
		while (!"?".equals(op)) {
			int ans = 0;
			if ("+".equals(op)) ans=a+b;
			if ("-".equals(op)) ans=a-b;
			if ("*".equals(op)) ans=a*b;
			if ("/".equals(op)) ans=a/b;
			System.out.println(ans);
			
			a = sc.nextInt();
			op = sc.next();
			b = sc.nextInt();
		}
	}
}

