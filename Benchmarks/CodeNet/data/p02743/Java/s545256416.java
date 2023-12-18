import java.util.*;


public class Main {
	public static void main (String[] args){
		Scanner sc =  new Scanner(System.in);
		double a = sc.nextInt();
		double b = sc.nextInt();
		double c = sc.nextInt();
		a = Math.sqrt(a);
		b = Math.sqrt(b);
		c = Math.sqrt(c);
		if(a+b-c<0) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}	
}