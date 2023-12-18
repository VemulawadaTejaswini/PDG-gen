import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		long ans = 0;
		if(a+b>=c*2){
			int min = Math.min(x, y);
			ans += min*c*2;
			x -= min;
			y -= min;
		}
		if(a>=c*2 && x>0){
			ans += x*c*2;
			y -= x;
			x = 0;
		}
		if(b>=c*2 && y>0){
			ans += y*c*2;
			x -= y;
			y = 0;
		}
		
		if(x>0) ans += x*a;
		if(y>0) ans += y*b;
		System.out.println(ans);
		return;
	}
}