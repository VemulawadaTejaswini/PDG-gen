import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int ac =0;
		int wa = 0;
		int tle = 0;
		int re= 0;
		
		for(int i=0;i<n;i++) {
			String s = scan.next();
			
			if(s.equals("AC")) {
				ac += 1;
			}else if(s.equals("WA")) {
				wa ++;
			}else if(s.equals("TLE")) {
				tle ++;
			}else {
				re ++;
			}
			
		}
		
		System.out.println("AC x " + ac);
		System.out.println("WA x " + wa);
		System.out.println("TLE x " + tle);
		System.out.println("RE x " + re);
		
		
	}
	
	
	public static int gcd(int x,int y) {
		if(x%y == 0) {
			return y;
		}else {
			return gcd(y,x%y);
		}
	}
}
 
