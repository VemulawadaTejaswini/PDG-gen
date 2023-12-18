import java.util.*;
 
public class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner (System.in);
      	int n = scan.nextInt();	
      	int ans = 0;
      	if(n >= 10000){
        	ans += (n % 10000) + 1;
        }
      	if(n >= 100){
        	ans += (n % 100) + 1;
        }
      	if(n >= 10){
        	ans += 9;
        }
      	else {
        	ans += n + 1;
        }
      System.out.print(ans);
    }
}
