import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		double A = stdIn.nextDouble();
		double B = stdIn.nextDouble();
		long N = stdIn.nextLong();
		
		long max = sub(A, B, 1);
		
		for(int i = 2; i <= N; i ++) {
			if(max < sub(A, B, i)) {
				max = sub(A, B, i);
			}else {
				break;
			}
		}
		System.out.println(max);
	}
	
	public static long sub(double A, double B, long x) {
		return (long) (Math.floor(A * x / B) - A * Math.floor(x / B));
	}
 
}