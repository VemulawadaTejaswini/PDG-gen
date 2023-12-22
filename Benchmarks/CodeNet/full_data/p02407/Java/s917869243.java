import java.io.ByteArrayInputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
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
		int n = sc.nextInt();
		
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i <= n; i++) {
			int a = sc.nextInt();
			list.add(a);
		}
		for (int i = n-1; i > 0; i--) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println(list.get(0));
	}
}

