import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		StringBuilder sb = new StringBuilder();
		
		long N = sc.nextLong();
		long NN = 0;
		
		for (long i = N/4 ; i >= 1 ; i--) {
			if (N % i == 0) {
				NN = N / i;
				System.out.println(NN + i - 2);
				break;
			}
		}
		

	}

}
