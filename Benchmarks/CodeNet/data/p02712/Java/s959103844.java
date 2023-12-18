import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long N = in.nextLong();
		long sum = 0;
		
		for(int i=1; i<=N; i++) {
			if(i%3 != 0 && i%5 != 0) {
				sum = sum + i;
			}
		}
		
		System.out.println(sum);
		
	}
}
