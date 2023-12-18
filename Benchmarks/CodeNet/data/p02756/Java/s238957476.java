import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int Q = sc.nextInt();
		int T = 0;
		int F = 0;

		boolean reverse = false;
		for(int i = 0; i < Q; i++) {
			 T = sc.nextInt();
			 if(T == 1) {
				 reverse = !reverse;//反転
				 continue;
			 }
			 F = sc.nextInt();
			 if((!reverse && F == 1) || (reverse && F == 2) ) {
				 S = sc.next() + S;
			 }else {
				 S = S + sc.next();
			 }
		}
		if(reverse) {
			S = new StringBuffer(S).reverse().toString();
		}
		System.out.println(S);
	}
}