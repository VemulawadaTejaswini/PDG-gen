
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    int n = scan.nextInt();
	    long h[]= new long[n];
	    for(int i=0;i<n;i++) {
	    	h[i]=scan.nextLong();
	    }
	    scan.close();
	    long cnt=0;
	    long max=0;
	    for(int i=n-2;i>=0;i--) {
	    	if(h[i+1]<=h[i])cnt++;
	    	else {
	    		if(cnt>max)max=cnt;
	    		cnt=0;
	    	}
	    }

	    System.out.println(max);

	}
}