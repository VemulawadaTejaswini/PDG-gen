import java.util.*;

public class Main {
  	static int MOD = 1000000007;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		long[] arr = new long[n];

		for(int i = 0; i < n; i++){
			arr[i] = sc.nextLong();

		}

		long sum = 0;
        long nn = 0;

		for(int i = 0; i < n; i++){
          for(int ii = i + 1; ii < n; ii++){
            nn = (arr[i] * arr[ii]);
            sum = add(sum, nn);
          }
		}

		System.out.println(sum);
	}
    public static long add(long a, long b){
	  return (a + b) % MOD;
    }
}