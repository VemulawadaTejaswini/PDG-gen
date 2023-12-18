import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int sum1 = k*x;
		int sum2 = (n-k)*y;
		int total = sum1+sum2;
		
		System.out.println(total);
				
	 
  	}
}
