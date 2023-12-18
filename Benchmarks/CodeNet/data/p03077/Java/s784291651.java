import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long [] A = new long [5];
		long min = (long) Math.pow(10, 15);
		for (int i=0;i<5;i++) {
			A[i] = sc.nextLong();
			min = Math.min(A[i], min);
		}
		long result;
		if (N % min == 0)
			result = N/min + 4;
		else 
			result = N/min + 5;
		System.out.println(result);
	}
}	
