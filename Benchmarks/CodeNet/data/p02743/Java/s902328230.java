import java.util.*;
public class Main{
	public static void main(String args[]){
    	Scanner s = new Scanner(System.in);
      	int a = s.nextInt();
		int b = s.nextInt();
      	int c = s.nextInt();
      	if((Math.sqrt(a)+Math.sqrt(b))<Math.sqrt(c))
           	System.out.println("Yes");
         else
          	System.out.println("No");
    }
}
