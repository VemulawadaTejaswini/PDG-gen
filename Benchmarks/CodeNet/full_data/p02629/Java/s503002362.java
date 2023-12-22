import java.util.*;

public class Main{
	public static void main(String args[]){
    	Scanner sc = new Scanner(System.in);
        
        long n = sc.nextLong();
      
      	List<String> alpa = Arrays.asList("","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z");
      
		long r = 0L;
      	String result = "";
      
      	while(n >= 26){
        	r = n/26L;
          	n -= r*26L;
          
          	result += alpa.get((int)r);
          
        }
      	if(n != 0L)
          result += alpa.get((int)n);
      
      	System.out.print(result);
    }
}
