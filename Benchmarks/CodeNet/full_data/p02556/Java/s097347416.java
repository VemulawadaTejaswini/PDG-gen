import java.util.*;
import java.math.RoundingMode;
import java.math.BigDecimal;
 
 
public class Main{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] x = new int[n];
		int[] y = new int[n];
		int temp[] = new int[n];
		for(int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
			temp[i] = x[i]+y[i];
		}
		Arrays.sort(temp);
		int ans = temp[n-1]-temp[0];
		for(int i = 0; i < n; i++) {
			temp[i] = Math.abs(x[i]-y[i]);
		}
		Arrays.sort(temp);
		if(ans<temp[n-1]-temp[0]) ans=temp[n-1]-temp[0];
		System.out.println(ans);
	}
}