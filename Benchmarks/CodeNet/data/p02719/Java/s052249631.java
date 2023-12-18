import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long K = sc.nextLong();
		
		if(N > K)N = N % K;
		System.out.println(Math.min(N, Math.abs(N-K)));
	}
}