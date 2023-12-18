	
	import java.util.Scanner;
	
		public class Main {
			
			public static void main(String[] args) {
			
			
				Scanner sc=new Scanner(System.in);
			
				int a=sc.nextInt();
				int b=sc.nextInt();
				
				int ebob=1;
				
				for(int i=1; i<Math.min(a, b); i++) {
					if(a%i==0 && b%i==0) ebob *=i;
					
				}
				System.out.println((long)(a*b)/ebob);	
				
			}
		
	}