import java.util.*;
public class Main {
	static int modNum = 1000000007;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int ans = 0;
		
		
		if(b == 0){
			System.out.println("0");
		}
		if(a * 2 >= b){
			ans += b/2;
			a -= ans;
			b -= ans * 2;
		}else{
			ans += a;
			a -= ans;
			b -= ans * 2;			
		}
		
		
			if(b >= 4){
				ans += b/4;
			}
		
		
		System.out.println(ans);
		
	}
}