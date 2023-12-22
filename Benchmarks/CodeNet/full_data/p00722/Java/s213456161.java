import java.util.*;
import java.math.*;
import java.text.*;
public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		boolean[] prime = new boolean[1000001];
		Arrays.fill(prime, true);
		prime[0] = false;
		prime[1] = false;
		for(int i=2; i<1000; i++){
			if(prime[i]){
				for(int j=2; i*j<1000000; j++){
					prime[i*j] = false;
				}
			}
		}
		
		while(true){
			int a = in.nextInt();
			int d = in.nextInt();
			int n = in.nextInt();
			if((a|d|n)==0) break;
			int ans = a;
			while(true){
				if(prime[a]) n--;
				if(n==0) break;
				a+=d;
			}
			System.out.println(a);
		}
	}
}