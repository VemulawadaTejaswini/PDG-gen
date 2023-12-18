import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
        double a = sc.nextLong();
      	double b = sc.nextLong();
      	double c = sc.nextLong();
      	double ab2 = 2* Math.sqrt(a*b);
      
      	System.out.println(Math.sqrt(1000000002));
          
      	if(2*(a + b) < c) System.out.println("Yes");
      	else System.out.println("No");
	}
}