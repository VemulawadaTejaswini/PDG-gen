import java.util.ArrayList;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    int sum = 0;
	    for(float i = 1; i <=n; i++){
	        if(i % 3 == 0 & i % 5 == 0){
	          

	            sum-=i;
	            
	        }
	        else if(i % 3 == 0){
	             sum-=i;
	        }
	        else if(i % 5 == 0){
	             sum-=i;
	        }
	        sum+=i;
	        
	    }
	    System.out.println(sum);
	}
	   
}
