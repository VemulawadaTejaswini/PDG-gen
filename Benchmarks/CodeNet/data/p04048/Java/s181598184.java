import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int D = N;
		int L = X > N - X ? X : N - X;
		int S = N - L;
		while (L > 0 && S > 0) {
		    D += 2 * S * (L / S);
		    int esc = S;
		    S = L % S;
		    L = esc;
		}
		System.out.println(D - L - S);
	}
}