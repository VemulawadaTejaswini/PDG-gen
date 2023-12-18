import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int a = sc.nextInt();		
		int b = sc.nextInt();
		int c = sc.nextInt();
		double x = Math.sqrt(a)+Math.sqrt(b);
		double y = Math.sqrt(c);
		if(x<y)
		System.out.println("Yes");
	    else
		System.out.println("No");
	    
	}	
}
