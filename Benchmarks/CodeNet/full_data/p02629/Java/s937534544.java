import java.util.Scanner;


	public class Main {
		
		

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
	        
			long n = sc.nextLong();
			 
	        String ret = "";
	        
	        while(n>0) {
	        	int c = (int)(n%26L);
	        	if(c==0) {
	        		c=26;
	        	}
	        	n = (n-c)/26L;
	        	ret = (char)('a'+c-1) + ret;
	        }
	        
	        System.out.println(ret);
		}
	}
