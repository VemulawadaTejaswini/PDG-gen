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
        int x = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        if(a >= b) out.println("delicious");
        else if(x >= b - a) out.println("safe");
        else out.println("dangerous");
        out.flush();
	}
}