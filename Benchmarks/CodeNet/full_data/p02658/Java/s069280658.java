import java.util.*;
import java.math.*;
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		BigInteger ans = new BigInteger("1");
		final BigInteger TEN_EIGHTEEN = new BigInteger("1000000000000000000");
		for(int i=0;i<N;++i){
			BigInteger A = new BigInteger(sc.next());
			BigInteger tmp = ans.multiply(A);
			if(tmp.compareTo(TEN_EIGHTEEN) <= 0){
				ans = ans.multiply(A);
			}else{
				ans = new BigInteger("-1");
			}
			//System.out.println("    "+ans.toString());
		}
		sc.close();
		if(ans.compareTo(new BigInteger("0")) == -1){
			ans = new BigInteger("-1");
			}

		System.out.println(ans.toString());
	}
}
