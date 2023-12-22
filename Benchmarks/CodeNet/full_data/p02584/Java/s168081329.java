import java.util.Scanner;
public class Main {
	 public static void main(String args[]){
	    	Scanner scanner = new Scanner(System.in);

	    	long x=scanner.nextInt();
	    	long k=scanner.nextInt();
	    	long d=scanner.nextInt();

	    	long x2=x;

	    	for(long j=0;j<k;j++) {
	    		long a=x2-d;
	    		long b=x2+d;
	    		if(a<0) {
	    			 a=a-(2*a);
	    		}
	    		if(b<0) {
	    			 b=b-(2*b);
	    		}
	    		if(a<b) {
	    			x2=x2-d;
	    		}
	    		else {
	    			x2=x2+d;
	    		}
	    	}

	    		if(x2<0) {
	    			x2=x2-(2*x2);
	    		}
	    		System.out.println(x2);



	    	 }
}

