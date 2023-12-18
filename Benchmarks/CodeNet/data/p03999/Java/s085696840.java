import java.io.PrintWriter;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		
		String S = stdin.next();
		long sum=0;
		
		
		for(int bit=0;bit<(1<<S.length()-1);bit++) {
			int plus=0;
			for(int i=0;i<S.length();i++) {
				if((1&(bit>>i)) == 1) {
					sum+=Long.parseLong((S.substring(plus, i+1)));
					plus = i+1;
				}	
			}
			if(plus != S.length()) {
				sum += Long.parseLong(S.substring(plus));
			}
		}
		out.println(sum);

		out.flush();
	}

	
}