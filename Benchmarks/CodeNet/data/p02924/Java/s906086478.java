import java.util.*;

public class Main {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int count=0;
	    int t = 1;
	    for(int i= N;i>0;i--) {
	    	
	    	count += t % N;
	    	t++;
	       
	    	
	    }
	     System.out.println(count);
	}
	
}

