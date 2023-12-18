import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();        
        long k = scan.nextLong();
		long min = 0;
		min = n%k;	//nをkで割った余り

		if(min<(k-min)){   
			System.out.println(min);
		} else {
			System.out.println(k-min);		
		}
	    scan.close();	
    }
}