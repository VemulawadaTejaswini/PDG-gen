import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int D = N;
		int L = X;
		int S = N - X;
		while (L > 0 && S > 0) {
		    if (S > L) { // swap L, S
		        int esc = S;
		        S = L;
		        L = esc;
		    }
		    int P = S * (L / S);
		    D += 2 * P;
		    L -= P;
		}
		System.out.println(D - L - S);
	}
}