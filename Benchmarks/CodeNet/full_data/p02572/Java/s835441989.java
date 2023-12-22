import java.util.*;
import java.math.RoundingMode;
import java.math.BigDecimal;
 
 
public class Main{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		int n = sc.nextInt();
		long[] a = new long[n];
		long sum = 0;
		long mod = 1000000007;
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
			for(int j = 0; j < i; j++) {
				sum+=a[j]*a[i]%mod;
			}
			//System.out.println(sum);
		}
		System.out.println(sum%mod);
	}
}