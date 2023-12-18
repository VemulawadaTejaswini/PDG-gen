import java.util.*;

public class Main{
  public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N =sc.nextInt();
		long M = sc.nextInt();
		long total = 0;
		for(long i = 0;i < M;i++) {
			long x = sc.nextLong();
			total += x;
		}
		if(N - total < -1) {
			System.out.println("-1");
		}
		System.out.println(N - total);
	}
}