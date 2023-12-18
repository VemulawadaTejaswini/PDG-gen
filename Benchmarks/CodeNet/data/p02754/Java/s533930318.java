import java.util.Scanner;
import java.lang.Math;

public class Main {
	public static void main (String[] args){
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
      	int y = 0, ans = 0;

        ans = (n / (a+b)) * a;
        y = n % (a+b);
      
        ans += Math.min(y, a);
      
      	System.out.println(ans);
    }
}