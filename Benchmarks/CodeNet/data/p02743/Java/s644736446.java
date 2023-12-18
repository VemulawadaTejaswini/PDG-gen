import java.util.*;

class Main{

    public static void main(String args[]){
    	Scanner sc = new Scanner(System.in);
      	long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
      	
      	if (c-a-b < 0){
            System.out.println("NO");    	        
        
        }
      else{
      	if( (4*a*b) < ((c - a - b) * (c - a - b))){
	        System.out.println("YES");    	
        }
      	else{
	        System.out.println("NO");    	        
        }
      }

    }
}