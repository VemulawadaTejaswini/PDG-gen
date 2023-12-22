import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		double A = stdIn.nextDouble();
		double B = stdIn.nextDouble();
		long N = stdIn.nextLong();
		
		long max = 0;
		
		for(long i = (long)B - 1; i < N; i += (long)B) {
			if(max < sub(A, B, i)) {
				max = sub(A, B, i);
			}else {
				break;
			}
		}
		
		max = Math.max(max, sub(A, B, N));
		System.out.println(max);
	}
	
	public static long sub(double A, double B, long x) {
		long ret = (long) (Math.floor(A * x / B) - A * Math.floor(x / B));
		return ret;
	}
}
