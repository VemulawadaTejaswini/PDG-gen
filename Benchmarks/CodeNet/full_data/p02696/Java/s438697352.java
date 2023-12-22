import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		double A = stdIn.nextDouble();
		double B = stdIn.nextDouble();
		long N = stdIn.nextLong();
		
		long max = 0;
		long maxIdx = 0;
		
		for(int i = (int)B - 1; i <= N; i += (int) B) {
			if(max < sub(A, B, i)) {
				max = sub(A, B, i);
			}else {
				maxIdx = i;
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