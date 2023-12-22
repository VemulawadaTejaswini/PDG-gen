import java.util.*;
import java.math.RoundingMode;
import java.math.BigDecimal;
 
 
 
public class Main{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		if(x==1)System.out.println(1+" "+0);
		else {
			long a = 0;
			long b = 0;
			long sub = 0;
			boolean found = false;
			while(found==false) {
				a++;
				b=0;
				while(a>=b) {
					long powa = (long)Math.pow(a,5);
					long powb = (long)Math.pow(b,5);
					sub = powa-powb-x;
					if(sub == 0) {
						found = true;
						break;
					}
					sub = powa+powb-x;
					if(sub == 0) {
						found = true;
						b=b*(-1);
						break;
					}
					b++;
				}
			}
			System.out.println(a+" "+b);
		}
    }
}