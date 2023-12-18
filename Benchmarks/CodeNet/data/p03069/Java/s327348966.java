import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		String s = sc.next();
		
		char[] c = s.toCharArray();
		int res = 0;
		
		while(true) {
			int cnt = 0;
			
			for(int i = 0; i < n-1; i++) {
				if(c[i] == '#' && c[i+1] == '.') {
					cnt++;
					res++;
					c[i] = '.';
				}
			}
			if(cnt==0) break;
		}
		
		System.out.println(res);
	}
}
