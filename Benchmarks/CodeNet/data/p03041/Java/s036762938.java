
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());
		String S = sc.next();
		
		String res = "";
		for (int i = 0; i < N; i++) {
			if(i != K-1) {
				res += S.charAt(i);
			}else {
				res += Character.toLowerCase(S.charAt(i));
			}
		}
		System.out.println(res);
		
	}
}
