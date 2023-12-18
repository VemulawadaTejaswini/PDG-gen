import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		// ------------------------------------------------
		int n = Integer.parseInt(sc.next());
		List<Integer> d = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			d.add(Integer.parseInt(sc.next()));
		}

		int ret = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				ret += d.get(i) * d.get(j);
			}
		}
		out.println(ret);

		// ------------------------------------------------
		sc.close();
		out.flush();
	}
}