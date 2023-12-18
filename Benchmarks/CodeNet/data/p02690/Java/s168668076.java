import java.util.*;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		long x = scan.nextInt();
		
		double value = Math.log(x) / Math.log(5.0);
		
		for(int i=0;i<1000;i++) {
			for(int j=-1000;j<1000;j++) {
				int y = (int)Math.pow(i, 5);
				int z = (int)Math.pow(j, 5);
				
				if(y-z == x) {
					int a = i;
					int b = j;
					System.out.println(a+" " +b);
					System.exit(0);
				}
			}
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

