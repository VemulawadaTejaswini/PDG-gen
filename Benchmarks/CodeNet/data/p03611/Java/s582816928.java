import java.util.*;
import java.math.RoundingMode;
import java.math.BigDecimal;
 
 
 
public class Main{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] count = new int[100000];
		int max = 0;
		for(int i = 0; i < n; i++) {
			int a = sc.nextInt();
			count[a]++;
		}
		for(int i = 0; i < 100000-2; i++) {
			int now=count[i]+count[i+1]+count[i+2];
			max = Math.max(now, max);
		}
		System.out.println(max);
	}
}