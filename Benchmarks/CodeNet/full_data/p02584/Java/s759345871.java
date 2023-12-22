
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextInt();
		long k = sc.nextInt();
		long d = sc.nextInt();
		long ans = x;
		
		for(int i=0;i<k;i++) {
			if(Math.abs(ans-d)>Math.abs(ans+d)) {
				ans+=d;
			}
			else {
				ans-=d;
			}
			
			if((Math.abs(ans-d)>ans&&Math.abs(ans-d-d)>ans) 
			&&(Math.abs(ans+d)>ans&&Math.abs(ans+d+d)>ans) && (k-i)%2==0) {
				break;
			}
		}
		
		ans=Math.abs(ans);
		System.out.println(ans);
	}
}
