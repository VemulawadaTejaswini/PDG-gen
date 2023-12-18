import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        long a = scan.nextLong();
        long b = scan.nextLong();
        long n = scan.nextLong();
		List<Long> listA = new ArrayList<Long>(); 


		if(calculate(a, b, 1) > calculate(a,b,n)){
			for (long x=1; x<(n+1)/2; x++) {
				listA.add(calculate (a, b, x));
	        }
        } else {
			for (long x=0; x<(n+1)/2; x++) {
				listA.add(calculate (a, b, (n-x)));
	        }
        }

		Collections.sort(listA,  Collections.reverseOrder());
		System.out.println(listA.get(0));
	    scan.close();	
    }
    
    public static long calculate(long a, long b, long x) {
    	return 	(long)((a*x)/b) - a*(long)(x/b);
	}
}