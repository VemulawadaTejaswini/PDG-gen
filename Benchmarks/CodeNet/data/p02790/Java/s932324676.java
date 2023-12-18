//package atcoder;
 
import java.util.*;
import java.math.BigDecimal;
 
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		String s = null;
		if(a<b) {
			s = String.valueOf(a);
			for(int i=1;i<b;i++) {
				s += String.valueOf(a);
			}
		}
		else {
			s = String.valueOf(b);
			for(int j=1;j<a;j++) {
				s += String.valueOf(b);
			}
		}
		System.out.println(s);
	}
}