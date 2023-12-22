import java.util.*;
import java.util.ArrayDeque;
import java.util.Queue;
import java.math.RoundingMode;
import java.math.BigDecimal;
 
 
 
public class Main{
	 public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		long[] pow = new long[65];
		for(int i = 0; i < 65; i++) {
			int a = i+1;
			pow[i]=a*a*a*a*a;
		}
		int a = 0;
		int b = 0;
		for(int i = 0; i < 65; i++) {
			a = i+1;
			for(int j = 0; j < 65; j++) {
				b=j+1;
				if(pow[a-1]-pow[b-1]==x) {
					break;
				}
				b=b*(-1);
				if(pow[a-1]+pow[b-1]==x) {
					break;
				}
			}
		}
		if(a!=0&&b!=0) {
			System.out.println(a+" "+b);
		}
	 }
}