import java.util.*;

public class std{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long n = input.nextLong();
		long res = Long.MAX_VALUE;
		for(long i = 1;i*i<=n;i++){
			long j = n/i;
			if(j*i == n){
				res = Math.min(res,j+i-2);
			}
		}
		System.out.println(res);
	}
}