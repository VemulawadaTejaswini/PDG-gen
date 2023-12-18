
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		String s = sc.next();
		sb.append(s);
		
		int q = Integer.parseInt(sc.next());
		
		for(int i = 0 ;i < q ;i++) {
			int p = Integer.parseInt(sc.next());
			if(p == 1) {
				sb.reverse();				
			}
			else {
				int r = Integer.parseInt(sc.next());
				String c = sc.next();
				if(r == 1) {
					sb.insert(0, c);
				}
				else {
					sb.insert(sb.length(), c);
				}
			}
			
		}
		
		String ans = sb.toString();
		System.out.println(ans);
		}
}
