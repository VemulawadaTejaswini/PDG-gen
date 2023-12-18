import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long K = sc.nextLong();
		if(K % 2 == 0) {
			System.out.println((long)(Math.pow((N / (K / 2)) - (N / K), 3) + Math.pow(N / K, 3)));
		} else {
			System.out.println((long)(Math.pow(N / K, 3)));
		}
	}
}
