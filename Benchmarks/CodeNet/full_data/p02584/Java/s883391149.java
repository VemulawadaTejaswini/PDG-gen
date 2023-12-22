import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		long x = scan.nextLong();
		long k = scan.nextLong();
		long d = scan.nextLong();
		
		
		long oppai = x/d; 
		long ans_a = x%d;
		long ans_b = Math.abs(Math.min(ans_a+d, ans_a-d));
		
		
		if(oppai > d){
			System.out.println(Math.abs(Math.min(x+d*k, x-d*k)));
		}else if(oppai%2 == 0) {
			if(k%2 == 0) {
				System.out.println(ans_a);
			}else {
				System.out.println(ans_b);
			}
		}else {
			if(k%2 == 1) {
				System.out.println(ans_a);
			}else {
				System.out.println(ans_b);
			}
		}
	}
	
	
	public static int gcd(int x,int y) {
		if(x%y == 0) {
			return y;
		}else {
			return gcd(y,x%y);
		}
	}
}
 



