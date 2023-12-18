
	


import java.util.*;


	public class Main {
	public static void main( String[] args) {			
					
					Scanner in = new Scanner(System.in);
					long a = in.nextLong();
					long b = in.nextLong();
					long c = in.nextLong();
					long num = c-a-b;
					
					if(num<0) {
						System.out.println("No");
					}
					else {
					 
						if(num*num > 4*a*b) {
							System.out.println("Yes");
						}
						else {
							System.out.println("No");
						}
					}
		
					
			}}