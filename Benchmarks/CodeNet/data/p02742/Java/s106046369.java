import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		long H = sc.nextLong();		
		long W = sc.nextLong();
		long count = 0;
		
		for(long i=1; i<=H; i++){
			if(W%2!=0&&i%2!=0)
			count += W/2+1; 
			else
			count += W/2;
		}
		System.out.println(count);
	    
	}	
}