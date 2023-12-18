import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		long N = stdIn.nextLong();
		long A = stdIn.nextLong();
		long B = stdIn.nextLong();
		long ans = 0;
		long sum = 0;
		long c = 0;
		c = N / (A + B);
		sum = c * A;
		ans = N % (A + B);

		if(ans > A){
			sum = sum + A;
		}
		else{
			sum = sum + ans;
		}
		System.out.println(sum);
		stdIn.close();
	}
}