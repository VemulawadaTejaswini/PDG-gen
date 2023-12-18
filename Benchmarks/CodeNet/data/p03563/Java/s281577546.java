import java.io.PrintWriter;
import java.util.ArrayList;
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
		int r = sc.nextInt();
        int g = sc.nextInt();
        sc.close();
		
        out.println(2*g-r);
        out.flush();
	}
}