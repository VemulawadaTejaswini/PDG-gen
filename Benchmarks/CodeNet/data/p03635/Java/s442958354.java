import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		solve();
	}

	public static void solve() {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
		int n = sc.nextInt();
        int m = sc.nextInt();
        int ans = (n-1) * (m-1);
        sc.close();
        out.println(ans);
        out.flush();
	}
}