import java.util.*;
import java.math.BigInteger;
class Main{
    public static void main (String[] args){
	Scanner sc = new Scanner(System.in);
	while(true) {
	    int n = sc.nextInt();
	    if (n == 0) break;
	    int count = 0;
	    for(int i=n+1;i<=2*n;i++){
	        if (BigInteger.valueOf(i).isProbablePrime(20))
		    count++;
	    }
	    System.out.println(count);
	}
    }
}