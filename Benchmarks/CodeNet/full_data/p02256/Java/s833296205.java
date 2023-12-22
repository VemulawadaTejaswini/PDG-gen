import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner (System.in);
		
		int x, y, tmp, rest;
		
		x = scan.nextInt();
		y = scan.nextInt();
		
		if(x < y){
			
			tmp = x;
			x = y;
			y = tmp;
			
		}
		
		for(;;){
			
			rest = x % y;
			x = y;
			y = rest;
			if(x % y == 0) break;
		}
		
		System.out.println(y);
	}
}