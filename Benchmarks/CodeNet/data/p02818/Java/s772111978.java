import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong(), B = sc.nextLong(), K = sc.nextLong();
		sc.close();
		long t = 0, a = 0;
		if(A>=K) {
			t=A-K;
			a=B;
		}
		else {
			t = 0;
			a = Math.max(0,B-(K-A));
		}
		
		System.out.println(t + " " + a);
		
	}
}