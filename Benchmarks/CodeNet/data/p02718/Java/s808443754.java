import java.util.*;
import java.math.RoundingMode;
import java.math.BigDecimal;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();	
		int[] a = new int[n];
		int sum = 0;
		int ans = 0;
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			sum+=a[i];
		}
		for(int i = 0; i < n; i++) {
			if(a[i]>=sum/(4*m)) {
				ans++;
			}
		}
		if(ans==m) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}