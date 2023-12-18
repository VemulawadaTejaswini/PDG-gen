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
		int n = sc.nextInt();
        int k = sc.nextInt();
        sc.close();
        int ans = 1;
        for(int i = 0; i < n; i++){
            ans = Math.min(ans * 2, ans + k);
        }
		
        out.println(ans);
        out.flush();
	}
}