import java.util.*;


public class Main {
	public static void main (String[] args){
		Scanner sc =  new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int Q = N/(A+B);
		int ex = N%(A+B);
		int R = 0;
		if(A > 0) {
			if(ex < A) {
				R = A * Q + ex;
			}
			else if(ex>=A) {
				R = (Q+1) * A;
			}
		}
		System.out.println(R);
	}
}