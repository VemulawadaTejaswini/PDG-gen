import java.util.*;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int k = scan.nextInt();
		int have[] = new int[n];
 		
		for(int i=0;i<k;i++) {
			int d = scan.nextInt();
			for(int j=0;j<d;j++) {
				int take = scan.nextInt();
				have[take-1] = 1;
			}
		}
		
		int ans = 0;
		for(int i=0;i<n;i++) {
			if(have[i] == 0) {
				ans += 1;
			}
		}
		
		System.out.println(ans);
		
	}	
	
	
	//最小公約数
	/*
	static int gcd (int a, int b) {
		int temp;
		while((temp = a%b)!=0) {
			a = b;
			b = temp;
		}
		return b;
	}
	*/
	
}
