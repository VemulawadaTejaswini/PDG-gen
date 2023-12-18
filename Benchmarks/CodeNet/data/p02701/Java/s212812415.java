import java.util.*;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		List<String> prezent = new ArrayList<String>();
		
		
		for(int i=0;i<n;i++) {
			String s = scan.next();
			if(prezent.contains(s)) {
				continue;
			}else {
				prezent.add(s);
			}
		}
		
		System.out.println(prezent.size());		
		
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
