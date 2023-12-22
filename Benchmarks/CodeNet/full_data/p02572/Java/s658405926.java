import java.util.*;
 
public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
      	long[] arr = new long[N];
      	for(int i=0; i<N; i++) arr[i] = sc.nextLong();
      	long[] sumArr = new long[N];
      	long sum = 0;
      
      	long mod = 1000000000 + 7;
      
      for(int i= N-1; i>=0; i--){
        sum = (sum + arr[i])%mod;
        sumArr[i] = sum;
      }
      
      	long res = 0;
      for(int i=0; i<N-1; i++){
        long nextSum = sumArr[i+1];
          res = (res + (arr[i] * nextSum)%mod)%mod;
      }
      	System.out.println(res);
	}
}