import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		sc.close();

		long min = N + 1;
		for (int i = 2; i < Math.sqrt(N); i++) {
			if ((N % i == 0) && ((i + (N / i)) < min)) {
				min = i + (N / i);
			}
		}
		System.out.println(min - 2);
	}
}
