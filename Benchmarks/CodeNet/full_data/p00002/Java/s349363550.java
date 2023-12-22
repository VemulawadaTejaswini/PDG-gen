import java.util.*;
public class Main {
	public static void main(String[] args){
	 
	Scanner sc= new Scanner (System.in);
	int a=0;
	int b=0;
	int c=0;
	while (sc.hasNext()) {
		a = sc.nextInt();
		b = sc.nextInt();
		c = a + b;
		int	count = 0;
		do {
			c /= 10;
			count++;
		} while(c != 0);
		System.out.println(count);
	}	
		
	 
	
	}

}