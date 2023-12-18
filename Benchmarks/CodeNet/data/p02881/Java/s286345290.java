import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        
        long sum = Integer.MAX_VALUE;
        for(int i=1;i*i<=n;i++) {
        	if(n%i==0) {
        		sum = Math.min(sum, Math.abs(i-1)+Math.abs(n/i-1));
        	}
        }
        System.out.println(sum);
	}
}