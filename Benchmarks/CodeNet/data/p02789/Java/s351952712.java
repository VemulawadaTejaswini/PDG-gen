import java.util.*;
 
public class Main{
	public static void main(String[] args){
      	int N,M;
    	Scanner scan = new Scanner(System.in);
      	N = scan.nextInt();
      	M = scan.nextInt();
      	
      	if(M == N){
        	System.out.println("Yes");
        }
      	else if(M != N){
        	System.out.println("No");
        }
      
    }
}