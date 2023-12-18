import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
        if(K==N){
        	System.out.println(N+1);
        	return;
        }
        long sum = (long) 1;
        long mn = (long) Math.pow(10,9)+7;
		for (int i = K; i < N+1; i++) {
			sum += combination(N+1,i);
            if(sum>mn){
            	sum = sum%mn;
            }
        }
        
		System.out.println(sum);
        return;
	}
	public static final long combination(int n, int r) {

		if (r == 1) {
			return n;
		}
	
		long sum = 1;
		for (int i = 0; i < r; i++) {
			sum += (n-i);
		}
        for (int i = 0; i < r; i++) {
			sum -= i;
        }
		return sum;
	}
}
