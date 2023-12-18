import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		if( a==b && b==c){
			if( a%2 == 0 ){
				System.out.println(-1);
			}else{
				System.out.println(0);
			}
			return;
		}
		
		long ans = 0;
		while(a%2==0 && b%2==0 && c%2==0){
			long x = b/2 + c/2;
			long y = c/2 + a/2;
			long z = a/2 + b/2;
			a=x;
			b=y;
			c=z;
			ans++;
		}
		
		System.out.println(ans);
		return;
	}
}