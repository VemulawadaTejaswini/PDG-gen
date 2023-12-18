import java.util.*;
class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());
		int X = Integer.parseInt(sc.next());
		int Y = Integer.parseInt(sc.next());
		
		if(N <= K) {
			System.out.println(N * X);
		}else {
			System.out.println(K * X + (N - K) * Y);
		}
	}
}
