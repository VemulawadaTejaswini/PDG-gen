import java.util.*;
 
public class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);	
      	int n = scan.nextInt();//all balls
        int k = scan.nextInt();//blue ball
      	System.out.println(n - k + 1);
      	for(int i = 2; i <= k; i ++){
          	int ans = fact(n - i + 1) / (fact(i) * fact(n - k));
        	int l = ans mod (10^9 + 7);
          	System.out.println(ans);
        }
    }
  	public  static int fact(int n ){
    	if(n < 1) {
        	return 1;
        }
      	else {
        	return n * fact(n - 1);
        }
    }
}