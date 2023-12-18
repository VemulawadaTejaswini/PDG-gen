import java.math.BigInteger;
import java.util.*;
public class Main {
	


	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		
		int n = sc.nextInt();
		
		int[] ps = new int[n];
		
		for(int i=0;i<n;i++) {
			ps[i] = sc.nextInt();
		}
		
		int ans = 0;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<i;j++) {
				if(ps[j] < ps[i]) {
					ans++;
					break;
				}
			}
		}
		
		System.out.println(n - ans);




		
		
		
		
		

		


		
		
	}
	


}

 