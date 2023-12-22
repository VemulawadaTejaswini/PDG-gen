import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] in = sc.next().toCharArray();
		int max = 0;
		int jsum = 0;
		int osum = 0;
		int isum = 0;
		for(int i = 0; i < in.length; i++) {
			if(in[i] == 'J') {
				if(jsum >= osum && isum >= osum) max = Math.max(osum, max);
				jsum++;
				osum = 0;
				isum = 0;
			}
			if(in[i] == 'O') {
				if(jsum >= osum && isum >= osum) max = Math.max(osum, max);
				osum++;
				isum = 0;
			}
			if(in[i] == 'I') {
				if(jsum >= osum && isum >= osum) max = Math.max(osum, max);
				isum++;
			}
		}
		System.out.println(max);
	}

	
}