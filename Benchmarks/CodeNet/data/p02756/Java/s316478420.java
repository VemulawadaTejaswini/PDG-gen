
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		StringBuilder sb = new StringBuilder();
		
		char []c = sc.next().toCharArray();
		
		int n = c.length;
		
		for(int i = 0 ;i < n ;i++) {
			sb.append(c[i]);
		}
		int q = Integer.parseInt(sc.next());
		
		for(int i = 0 ;i < q ;i++) {
			int k = Integer.parseInt(sc.next());
			
			if(k == 1) {
				
				char t = sb.charAt(0);
				char u = sb.charAt(sb.length()-1);
				sb.deleteCharAt(0);
				sb.deleteCharAt(sb.length()-1);
				sb.append(t);
				sb.insert(0,u);
			}
			else {
				int l = Integer.parseInt(sc.next());
				String s = sc.next();
				if(l == 1) {
					sb.insert(0, s);
				}
				else {
					sb.append(s);
				}
				
			}
		}
			
			String ans = sb.toString();
			System.out.println(ans);
	}

}
