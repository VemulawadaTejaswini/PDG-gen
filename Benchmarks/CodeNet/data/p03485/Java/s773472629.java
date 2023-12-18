import java.util.*;

public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
 
	int max = Math.max(a,b);
    int min = Math.min(a,b);
      
    double n = max-min;
    double N = n/2;
    int ans = (int)(min+N); 

	System.out.println(ans);
      }
}
