import java.util.Scanner;
 
 
public class Main{
     
    public static void main(String[] args){
    	
    	final Scanner sc = new Scanner(System.in);
    	
    	final int n = sc.nextInt();
    	
    	long left = 0, right = 0;
    	for(int i = 0; i < n; i++){
    		final long p = sc.nextLong();
    		final char c = sc.next().toCharArray()[0];
    		final int q = sc.nextInt();
    		
    		if(c == ')'){
    			left += q;
    		}else if(c == '('){
    			right += q;
    		}
    		
    		System.out.println(left == right ? "Yes" : "No");
    	}
    	
    }
     
}