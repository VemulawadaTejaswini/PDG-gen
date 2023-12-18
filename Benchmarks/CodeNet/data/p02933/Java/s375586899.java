import java.io.PrintWriter;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		
		int a = Integer.parseInt(stdin.next());
		String s = stdin.next();
		
		if(a>=3200) {
			out.println(s);
		}
		else {
			out.print("red");
		}
		
		out.flush();
	}
	
}