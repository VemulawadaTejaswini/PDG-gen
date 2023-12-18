import java.util.*;
import java.math.BigInteger;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
		int n = sc.nextInt();
      
        BigInteger bi = BigInteger.valueOf(1);
        for (int i = 1; i <= n; i++) {
            bi = bi.multiply(BigInteger.valueOf(i));
        }
        bi = bi.remainder(new BigInteger("1000000007"));
    
		// 出力
		System.out.println(bi);
	}
}