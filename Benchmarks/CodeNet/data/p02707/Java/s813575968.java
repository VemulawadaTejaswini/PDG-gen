import java.util.*;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int ans[] = new int [n];
		for(int i=0;i<n-1;i++) {
			int now = scan.nextInt();
			ans[now-1] += 1; 
		}
		for(int i=0;i<n;i++) {
			System.out.println(ans[i]);
		}
		
		
		
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
