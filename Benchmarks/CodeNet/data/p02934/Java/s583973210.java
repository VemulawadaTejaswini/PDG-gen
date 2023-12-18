import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		double sum = 0;
		for(int i = 0; i < N; i++) {
			double A = stdIn.nextInt();
			sum += 1/A;
		}
		
		System.out.println(1/sum);

	}

}