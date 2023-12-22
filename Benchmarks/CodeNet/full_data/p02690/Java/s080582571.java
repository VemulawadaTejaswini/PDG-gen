import java.util.*;
import java.util.ArrayDeque;
import java.util.Queue;
import java.math.RoundingMode;
import java.math.BigDecimal;
 
 
 
public class Main{
	 public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		long[] pow = new long[66];
		for(int i = 0; i < 66; i++) {
			long a = (long)i;
			pow[i]=a*a*a*a*a;
			//System.out.println(pow[i]);
		}
		int a = 0;
		int b = 0;
		for(int i = 0; i < 66; i++) {
			long powa = pow[i];
			for(int j = 0; j < 65; j++) {
				long powb = pow[j];
				if(powa-powb==(long)x) {
					a = i;
					b = j;
					break;
				}
				if(powa+powb==(long)x) {
					a = i;
					b = -j;
					//System.out.println(a);
					break;
				}
			}
			if(a!=0||b!=0)break;
		}
		if(a!=0||b!=0) {
			System.out.println(a+" "+b);
		}
	 }
}