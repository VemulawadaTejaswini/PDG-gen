import java.util.*;
import static java.lang.System.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int h = sc.nextInt();
		int a = sc.nextInt();
		
		int ans = h / a;
		if (h % a != 0) ans++;
		out.println(ans);

		out.close();
	}
}