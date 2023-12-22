import java.io.IOException;
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0;
		int count=0;
		while(scan.hasNext()){	
			num= scan.nextInt();
			boolean[] prime = new boolean[num]; 
			prime[0] = false;
	        prime[1] = false;
	        int max = (int)Math.sqrt(prime.length);
	        for(int i=2;i<num;i++)
	        	prime[i]=true;
	        for (int p = 2; p <= max; p++) {
	            if (prime[p]) {
	                for (int i = p * 2; i < prime.length; i += p) {
	                    prime[i] = false;
	                }
	            }
	        }for(int i=0;i<num;i++){
	        	if(prime[i])
	        		count++;
	        }
	        System.out.println(count);
			count=0;
		}
	}	
}