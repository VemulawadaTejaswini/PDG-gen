import java.util.*;
 
public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
      	long[] arr = new long[N];
      	for(int i=0; i<N; i++) arr[i] = sc.nextLong();
      	long res = 0;
      	long mod = 1_000_000_000 + 9;
      for(int i=0; i<N; i++){
        for(int j=i+1; j<N; j++){
          res = (res + (arr[i] * arr[j])%mod)%mod;
        }
      }
      	System.out.println(res);
	}
}