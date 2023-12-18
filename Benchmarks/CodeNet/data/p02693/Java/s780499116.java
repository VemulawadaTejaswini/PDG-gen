import java.util.*;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int k = scan.nextInt();
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		for(int i=a;a<=b;i++) {
			if(i%k == 0) {
				System.out.println("OK");
				System.exit(0);
			}
		}
		
		System.out.println("NG");
		
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