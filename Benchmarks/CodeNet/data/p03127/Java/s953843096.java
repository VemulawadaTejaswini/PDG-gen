import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = sc.nextInt();
		for (int i = 1; i < n; i++) {
		    ans = gcd(ans, sc.nextInt());
		}
		System.out.println(ans);
   }
   
   static int gcd(int x, int y) {
       if (x % y == 0) {
           return y;
       } else {
           return gcd(y, x % y);
       }
   }
}
