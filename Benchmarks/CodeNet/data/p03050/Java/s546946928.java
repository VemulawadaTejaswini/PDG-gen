import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		long N = stdIn.nextLong();
		long output = 0;
		for(long m = 1; m < N; m++) {
			long a = N/m;
			if(a == N%m) {
				output += m;
			}
			else {
				
			}
		}
		System.out.println(output);

	}

}