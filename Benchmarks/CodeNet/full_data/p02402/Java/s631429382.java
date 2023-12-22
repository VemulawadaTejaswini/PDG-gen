import java.util.Scanner;

class Main{
      	Scanner scan = new Scanner(System.in);
    	
    	int n = scan.nextInt();
    	long a;
    	long min = 0;
    	long max = 0;
    	long sum = 0;
    	
    	for(int i = 0; i < n; i++){
    	    a = scan.nextInt();
    	    if(i == 0) min = a;
    	    
    	    min = Math.min(min, a);
    	    max = Math.max(max, a);
    	    sum += a;
    	}
    	
    	System.out.println(min + " " + max + " " + sum);
    	
     }
}