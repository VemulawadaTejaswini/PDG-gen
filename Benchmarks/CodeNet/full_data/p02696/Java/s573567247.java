import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		double A = stdIn.nextLong();
		double B = stdIn.nextLong();
		long N = stdIn.nextLong();
		long max = 0;
		
		for(int i = (int)B - 1; i <= N; i += (int)B) {
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