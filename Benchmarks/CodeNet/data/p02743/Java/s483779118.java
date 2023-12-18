import java.util.*;

class Main{

    public static void main(String args[]){
    	Scanner sc = new Scanner(System.in);
      	long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
      
        double rA = Math.sqrt(a);
		double rB = Math.sqrt(b);
      	double rC = Math.sqrt(c);
            
      	if(a+b < c){
	        System.out.println("YES");    	
        }
      	else{
	        System.out.println("NO");    	        
        }

    }
}