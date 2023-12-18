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
		int r = sc.nextInt();   
		int g = sc.nextInt(); 
		int b = sc.nextInt();
		sc.close();
		if((r*100+g*10+b) % 4 == 0){
			out.println("YES");
		}else{
			out.println("NO");
		}
		out.flush();
	}
}