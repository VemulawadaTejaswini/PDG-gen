import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long H = sc.nextLong();
		long W = sc.nextLong();
		
		System.out.println((H*W+1)/2);

		sc.close();
	}
}
