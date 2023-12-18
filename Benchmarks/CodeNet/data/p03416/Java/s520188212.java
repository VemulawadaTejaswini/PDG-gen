import java.util.*;
import java.io.*;

public class Main {
	static boolean reverse(int n) {
		int rev = 0; 
		while(n!= 0) {
			rev = rev * 10 + n%10; 
			n /= 10; 
		}
		return (n == rev) ? true:false;
	}
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);	
		int a = sc.nextInt();
		int b = sc.nextInt();
		int ans = 0; 
		for(int i = a; i<= b; i++) {
			if(reverse(i)) ans++; 
		}
		System.out.println(ans); 
	}
	
}