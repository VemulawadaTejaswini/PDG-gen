import java.io.PrintWriter;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		
		int N = Integer.parseInt(stdin.next());
		String s[] = new String[N];
		int cnt = 0;
		
		for(int i=0;i<N;i++) {
			s[i] = stdin.next();
		}
		for(int h=0;h<N;h++) {
			char[] copy = s[h].toCharArray();
			Arrays.sort(copy);
			s[h] = new String(copy);
		}

		for(int i=0;i<N-1;i++) {
			for(int j=i+1;j<N;j++) {
				if(s[i].equals(s[j])) {
					cnt += 1;
				}
			}
		}

		out.println(cnt);

		out.flush();
	}

	
}