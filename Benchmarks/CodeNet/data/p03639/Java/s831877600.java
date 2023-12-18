
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    
	    long m = 1;
	    long count =0;
	    for (int i = 0; i<N; i++){
	    	m*=sc.nextLong();
	    	while (m%4==0){
	    		m/=4;
	    		count++;
	    	}
	    }
	   
	    
	    if (N-2<=count)
	    	System.out.println("Yes");
	    else 
	    	System.out.println("No");
	}

}
