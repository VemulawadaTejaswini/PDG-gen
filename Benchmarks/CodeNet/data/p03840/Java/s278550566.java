import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long xi = sc.nextLong();
		long xo = sc.nextLong();
		long xt = sc.nextLong();
		long xj = sc.nextLong();
		long xl = sc.nextLong();
		long ans = 0;

		if( xj%2 == 1 && xl%2 == 1 && xi >= 1 ){
			ans += 3;
			xj--; xl--; xi--;
		}

		ans += (xj/2)*2;
		ans += (xl/2)*2;
		ans += (xi/2)*2;
		ans += xo;

		System.out.println(ans);
		return;
	}
}