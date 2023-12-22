

import java.util.*;

public class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n,x;
		n = scan.nextInt();
		x = 1;
		
		for(int count = 0 ; count< n ;count++){
			if ( x % 3 == 0 ){
				sb.append(" ");
				sb.append(x);
			}else if( x % 10 == 3 ){
				sb.append(" ");
				sb.append(x);
			}
			x++;
			
		}
		
		System.out.println(new String(sb));
		sb.delete(0, sb.length());
		
		
	}
}