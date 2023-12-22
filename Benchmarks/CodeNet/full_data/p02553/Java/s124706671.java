import java.util.*;
import java.math.RoundingMode;
import java.math.BigDecimal;
 
 
public class Main{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		long a = sc.nextInt();
		long b = sc.nextInt();
		long c = sc.nextInt();
		long d = sc.nextInt();
		long ac = a*c;
		long ad = a*d;
		long bc = b*c;
		long bd = b*d;
		long r = 0;
		long l = 0;
		if(ac-ad>0) {
			r = ac;
		}
		else {
			r = ad;
		}
		if(bc-bd>0) {
			l = bc;
		}
		else {
			l = bd;
		}
		System.out.println(Math.max((long)r, (long)l));
		
	}
}