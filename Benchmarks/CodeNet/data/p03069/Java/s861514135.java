import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long n = Integer.parseInt(sc.next());
		String s = sc.next();

		char[] c = s.toCharArray();
		
		long wc = 0;
		
		for(char ch : c) if(ch == '.') wc++;
		
		int res = 0;
		
		for(int i = 1; i < n; i++){
			if(c[i-1] == '#' && c[i] == '.') {
				c[i-1] = '.';
				res++;
				if(i != 0) i--;
			}
		}
		
		System.out.println(Math.min(res, wc));
	}
}
