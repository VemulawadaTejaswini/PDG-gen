import java.util.*;
import java.math.RoundingMode;
import java.math.BigDecimal;
 
 
 
public class Main{
	 public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		int[] p = new int[n];
		for(int i = 0; i < n; i++) {
			p[i] = sc.nextInt();
		}
		Arrays.sort(p);
		int ans = x;
		int sub = 100;
		if(n==0) ans = x;
		else if(x<p[0]) ans=x;
		else if(x>p[n-1]) ans=x;
		else {
			if(x==p[0]) ans=x-1;
			else if(p[n-1]==x&&p[n-1]-p[n-2]<=1) ans=x+1;
			else {
				for(int i = 0; i < n-1; i++) {
					int left = p[i];
					int right = p[i+1];
					if(right-left>2) {
						if(left<x&&x<right) {
							ans = x;
							break;
						}
						else if(right<=x&&sub>x-(right-1)) ans = right-1;
						else if(x<=left&&sub>(left-1)-x) ans = left+1; 
					}
				}
			}
		}
		
		System.out.println(ans);
	 }
}
