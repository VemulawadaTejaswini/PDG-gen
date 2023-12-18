import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int N = sc.nextInt();
		int[] a = new int[N];
		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		if(a[1] % a[0] == 0){
			System.out.println(a[0]);			
		} else {			
			System.out.println(1);
		}
		
	}		
	
	 private static long gcd(long a, long b) {
		    if (b == 0) {
		      return a;
		    }
		    return gcd(b, a%b);
		  }
	 
	 private static long all(long n, long count, int N) {
		    if (count == N) {
			      return count;
			    }
		    return all(1, count, N);
	 }

}