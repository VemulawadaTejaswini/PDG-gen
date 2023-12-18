import java.util.Arrays;
import java.util.Scanner;


public class Main {
	public static void main(String[] args){
Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
     	int i=0;
		int j=n-1;
		int mid=0;
		String z="";
				
		while(i<j-1){	
			mid = (i+j)/2;
			
			System.out.flush();
			System.out.println(i);			
			System.out.flush();
			String x = s.next();
			if (x.equals("Vacant"))
				System.exit(0);
			
			System.out.flush();
			System.out.println(mid);
			System.out.flush();
		    z = s.next();
			if (z.equals("Vacant"))
				System.exit(0);
			
			if(i%2==mid%2){
				if(x.equals(z))
					i=mid;	
				else
					j=mid;		
			}
			else{
				if(!x.equals(z))
					i=mid;	
				else
					j=mid;	
			}					
			
		}	
		System.out.flush();
		System.out.println(i);
		System.out.flush();
	    z = s.next();
		if (z.equals("Vacant"))
			System.exit(0);
		
		System.out.flush();
		System.out.println(mid);
		System.out.flush();
	    z = s.next();
		if (z.equals("Vacant"))
			System.exit(0);
		
		System.out.flush();
		System.out.println(j);
		System.out.flush();
	    z = s.next();
		if (z.equals("Vacant"))
			System.exit(0);
	}
}
