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
		int ans = -1;
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
					if(right>x&&left<x) ans = x;
					else if(left>=x&&sub>left+1-x) {
							if(right-left>1) {
								ans=left+1;
								sub = ans-x;
							}
							
						}
						else if(left>=x&&sub<left+1-x) {
							break;
						}
						else if(right<=x&&sub>x-(right-1)) {
							if(right-left>1) {
								ans=right-1;
								sub = x-ans;
							}
							
						}
						else if(right<=x&&sub<x-(right-1)) {
							break;
						}
				}
			}
		}
		if(ans==-1) {
			if(Math.abs((p[0]-1)-x)<=Math.abs((p[n-1]+1)-x)) {
				ans = p[0]-1;
			}
			else ans =p[n-1]+1;
		}
		System.out.println(ans);
	 }
}