import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		long a = sc.nextLong();		
		long b = sc.nextLong();
		long c = sc.nextLong();
		double x = Math.sqrt(a)+Math.sqrt(b);
		double y = Math.sqrt(c);
			if(x<c)
			System.out.println("Yes");
			else
			System.out.println("No");
		

	}	
}