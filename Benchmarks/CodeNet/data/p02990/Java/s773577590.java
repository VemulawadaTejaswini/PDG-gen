import java.util.*;
 
public class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);	
      	int n = scan.nextInt();//all balls
        int k = scan.nextInt();//blue ball
		int sum;
      	sum = n - k + 1;
      	System.out.println(sum);
      	for(int i = 2; i < k ; i ++){
          	int ans = fact(n - k + i) / (fact(i) * fact(n - k));
          	sum = sum + ans;
        	int l = ans % (10^9 + 7);
          	System.out.println(ans);
        }
      	int m = fact(n) /(fact(k) * fact(n - k)) - sum;
      	System.out.print(m % (10^9 + 7));
      	
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