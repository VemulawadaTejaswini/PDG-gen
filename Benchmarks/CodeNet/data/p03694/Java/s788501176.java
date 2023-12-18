import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		solve();
	}

	public static void solve() {
  	Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int n = sc.nextInt();
		List<Integer> a = new ArrayList<>();
		for(int i = 0; i < n; i++) a.add(sc.nextInt());
		Collections.sort(a);
		out.println(a.get(n-1) - a.get(0));
		sc.close();
		out.flush();
	}
}