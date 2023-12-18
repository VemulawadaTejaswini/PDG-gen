import java.util.*;

public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	long a = sc.nextLong();
      	long b = sc.nextLong();
      	long x = sc.nextLong();
      
      	long fb = (b / x) + 1;
 		long fa = 0;
      	if(a - 1 != -1){
          	a = a - 1;
        	fa = (a / x) + 1;
        }
      	System.out.println(fb - fa);
    }
}