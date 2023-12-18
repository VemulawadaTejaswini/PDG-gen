import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		sc.close();

		long min = N + 1;
		for (int i = 2; i <= Math.sqrt(N); i++) {
			long temp = i + (N / i);
			if ((N % i == 0) && (temp < min)) {
				min = temp;
			}
		}
		System.out.println(min - 2);
	}
}
