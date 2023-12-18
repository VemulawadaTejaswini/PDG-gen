import java.util.*;

public class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
      	var N = scan.nextInt();
      	var M = scan.nextInt();
      	
      	if(M == N){
        	System.out.println("Yes");
        }
      	else if(M != N){
        	System.out.println("No");
        }
      
    }
}