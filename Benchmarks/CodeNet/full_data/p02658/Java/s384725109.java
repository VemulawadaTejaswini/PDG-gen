import java.math.BigInteger;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		BigInteger ans = new BigInteger("1");
		for(int i=0; i<n; i++){
			String str = sc.next();
			BigInteger a = new BigInteger(str);
			ans = ans.multiply(a);
		}	
		BigInteger hikaku = new BigInteger("1000000000000000000");
		if(ans.compareTo(hikaku) == 1){
			System.out.println(-1);
		} else {
			System.out.println(ans);
		}
	}
}
