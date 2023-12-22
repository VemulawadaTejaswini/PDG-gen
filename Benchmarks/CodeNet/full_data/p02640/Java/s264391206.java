import java.util.*;
import java.math.RoundingMode;
import java.math.BigDecimal;
 
 
 
public class Main{
	 public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		boolean ok=false; 
		for(int i = 0; i <= x; i++) {
			int ans = 2*i+4*(x-i);
			if(ans == y) {
				ok = true;
				break;
			}
		}
		if(ok) System.out.println("Yes");
		else System.out.println("No");
	 }
}
