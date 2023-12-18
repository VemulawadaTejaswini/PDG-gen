import java.util.*;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		String s = scan.next();
		int ans = 0;
		
		for(int i=0;i<n-2;i++) {
			char first = s.charAt(i);
			for(int j=i+1;j<n-1;j++) {
				if(first != s.charAt(j)) {
					char second = s.charAt(j);
					for(int k=j+1;k<n;k++) {
						if(second != s.charAt(k) && first != s.charAt(k)) {
							if(j-i != k-j) {
								ans += 1;
							}
						}
					}
				}
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
