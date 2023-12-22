import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	void run(){
		int n = sc.nextInt() - 1;
		int m = sc.nextInt();
		
		long s[] = new long[n+1];
		
		for(int i =0 ; i < n ; i++){
			s[i+1] = s[i] + sc.nextInt();
		}
		
		int p  =0;
		long ans = 0;
		for(int i = 0 ;i  < m ;i++){
			int p2 = sc.nextInt();
			ans += Math.abs(s[p2+p] - s[p]);
			p = p+p2;
		}
		System.out.println(ans%100000);
		
	}
	public static void main(String[] args){
		Main m = new Main();
		m.run();
	}
}