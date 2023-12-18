import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int X = stdIn.nextInt();
		
		int ans = N;
		
		if(N - X < X){
			ans += square(N - X, X);
		} else{
			ans += square(X, N - X);
		}
		
		System.out.println(ans);
	}
	
	private static int square(int S, int L){
		
		int Q = L/S;
		int R = L%S;
		
		if(R == 0){
			return S*(2*Q - 1);
		} else{
			return S*(2*Q) + square(R, S);
		}
	}
}