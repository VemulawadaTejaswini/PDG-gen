import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		long[] a = new long[n];
		boolean zero = false;
		for(int i=0;i<n;i++){
			a[i] = sc.nextLong();
			if(a[i]==0){
				zero = true;
			}
		}
		BigInteger ans = new BigInteger(String.valueOf(a[0]));
		for(int i=1;i<n;i++){
			ans = ans.multiply(new BigInteger(String.valueOf(a[i])));
			if(ans.compareTo(new BigInteger(String.valueOf((long) Math.pow(10,18)))) == 1){
				ans = new BigInteger(String.valueOf(-1));
				break;
			}
		}
		System.out.println(zero ? 0 : ans);
	}
}
