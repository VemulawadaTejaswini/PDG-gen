import java.io.PrintWriter;
import java.util.*;

public class Main {
		public static void main(String[] args) {
			Scanner stdin = new Scanner(System.in);
			PrintWriter out = new PrintWriter(System.out);
			
			int A = Integer.parseInt(stdin.next());
			int B = Integer.parseInt(stdin.next());
			
			for(int i=0;i<=1000000000;i++) {
				if(Math.abs(A-i) == Math.abs(B-i)) {
					out.println(i);
					break;
				}
				else if(i == 1000000000) {
					out.println("IMPOSSIBLE");
					break;
				}
			}
			
			out.flush();
	}
}


