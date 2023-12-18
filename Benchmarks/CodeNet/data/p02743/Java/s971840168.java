import java.util.*;

class Main{

    public static void main(String args[]){
    	Scanner sc = new Scanner(System.in);
      	long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
                  
      	if(a+b < c){
	        System.out.println("YES");    	
        }
      	else{
	        System.out.println("NO");    	        
        }

    }
}