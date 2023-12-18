import java.util.*;

public class Main{
  public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		long K = sc.nextLong();
		if(A + B <= K) {
			A = 0;
			B = 0;
		}else if(A <= K && K < A + B) {
			B = A + B - K;
			A = 0;
		} else {
			A = A - K;
		}
		System.out.println(A + " " + B);
	}
}