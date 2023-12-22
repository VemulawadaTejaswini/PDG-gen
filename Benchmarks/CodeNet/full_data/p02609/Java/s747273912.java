import java.math.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		int n, bitCnt = 0, y, bit, bb, newBitCnt, rem, ans = 0, vx, vy ;
		String s ;
		char x ;
		BigInteger val = BigInteger.valueOf(0), newVal ;
		n = sc.nextInt() ;
		s = sc.next() ;
		
		for (int i = 0; i < n; i++) {
			x = s.charAt(i) ;
			y = x - '0' ;
			bb = n - 1 - i ;
			bit = (1 << bb) ;
			if (y == 1) {
				bitCnt++ ;
				val = val.add(BigInteger.valueOf(bit)) ;
			}
		}
		
		for (int i = 0; i < n; i++) {
			ans = 1 ;
			x = s.charAt(i) ;
			y = x - '0' ;
			bb = n - 1 - i ;
			bit = (1 << bb) ;
			if (y == 1) {
				newBitCnt = bitCnt - 1 ;
				newVal = val.subtract(BigInteger.valueOf(bit)) ;
			}
			else {
				newBitCnt = bitCnt + 1 ;
				newVal = val.add(BigInteger.valueOf(bit)) ;
			}
			newVal = newVal.remainder(BigInteger.valueOf(newBitCnt)) ;
			rem = newVal.intValue() ;
			while (rem != 0) {
				ans++ ;
				vx = rem ;
				vy = Integer.bitCount(vx) ;
				rem = vx % vy ;
			}
			System.out.println(ans) ;
		}
		System.gc(); 
	}
}
