import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
        double a = sc.nextLong();
      	double b = sc.nextLong();
      	double c = sc.nextLong();
      
      	a = Math.sqrt(a);
      	b = Math.sqrt(b);
      	c = Math.sqrt(c);
          
      	if(a + b < c) System.out.println("Yes");
      	else System.out.println("No");
	}
}