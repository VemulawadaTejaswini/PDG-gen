import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		
		if(N%2==0) {
			int h = N/2 - 1;
			String bs = S.substring(0,h+1);
			String as = S.substring(h+1,N);
			if(as.equals(bs)) {
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");
	}
}
