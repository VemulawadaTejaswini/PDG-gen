import java.util.*;

public class Main{
//public class abc165_d{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		long A = scan.nextLong();
		long B = scan.nextLong();
		long N = scan.nextLong();

		double ans = 0;
		double sub = 0;

		for(long i = 1; i<=N; i++){
			sub = Math.floor(A*i/B) - (5  * Math.floor(i/B));
			ans = Math.max(sub, ans);
		}

		System.out.println(ans);
	}

}