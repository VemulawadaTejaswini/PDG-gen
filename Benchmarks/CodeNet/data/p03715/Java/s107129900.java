import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		if(H%3==0 || W%3==0){
			System.out.println(0);
			return;
		}
		
		long a1 = W/3;
		long a2 = (W-a1)*(long)Math.ceil((double)H/2.0);
		long a3 = (W-a1)*(long)Math.floor((double)H/2.0);
		long cur = Math.max(a1*H,Math.max(a2, a3)) - Math.min(a1*H, Math.min(a2,a3));
		a1++;
		a2 = a2 = (W-a1)*(long)Math.ceil((double)H/2.0);
		a3 = (W-a1)*(long)Math.floor((double)H/2.0);
		cur = Math.min(cur, Math.max(a1*H,Math.max(a2, a3)) - Math.min(a1*H, Math.min(a2,a3)));
		
		a1 = H/3;
		a2 = (H-a1)*(long)Math.ceil((double)W/2.0);
		a3 = (H-a1)*(long)Math.floor((double)W/2.0);
		cur = Math.min(cur, Math.max(a1*H,Math.max(a2, a3)) - Math.min(a1*H, Math.min(a2,a3)));
		a1++;
		a2 = (H-a1)*(long)Math.ceil((double)W/2.0);
		a3 = (H-a1)*(long)Math.floor((double)W/2.0);
		cur = Math.min(cur, Math.max(a1*H,Math.max(a2, a3)) - Math.min(a1*H, Math.min(a2,a3)));
		
		cur = Math.min(cur, Math.min(H, W));
		System.out.println(cur);
		return;
	}
}