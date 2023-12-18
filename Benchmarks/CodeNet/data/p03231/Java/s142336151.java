import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		    Scanner sc = new Scanner(System.in);

		    int n = sc.nextInt();
		    int m = sc.nextInt();
		    String s = sc.next();
		    String t = sc.next();
		    
		    int gcd = gcd(n,m);
		    int count = 0;
		    for(int i = 0; i < gcd; ) {
		    	if(s.substring(0+i*n/gcd,1+i*n/gcd).equals(t.substring(0+i*m/gcd, 1+i*m/gcd))) {
		    		count++;
		    		i++;
		    	}
		    }
		    if(count == gcd) {
		    	System.out.println(n*m/gcd);
		    }else {
		    	System.out.println(-1);
		    }
		    
		    
		    sc.close(); }
	
	public static  int gcd(int a, int b) {
	    if (a < b) {
	        int tmp = a;
	        a = b;
	        b = tmp;
	    }

	    int r = -1;
	    while (r != 0) {
	        r = a % b;
	        a = b;
	        b = r;
	    }

	    return a;    
	}

}