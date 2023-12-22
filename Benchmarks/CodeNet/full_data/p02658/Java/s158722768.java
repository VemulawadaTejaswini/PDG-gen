import java.util.*;
import java.util.function.*;
import java.math.*;
public class Main {
    public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		BigInteger lim = BigInteger.valueOf(1000000000000000000l);
		BigInteger ret = BigInteger.ONE;
		for(int i = 0; i < N; i++) {
			ret = ret.multiply(BigInteger.valueOf(s.nextLong()));
		}
		if(ret.compareTo(lim) == 1) {
			System.out.println(-1);
		}else {
			System.out.println(ret);
		}
    }
}