import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		long a = sc.nextDouble();
		long b = sc.nextDouble();
		long c = sc.nextDouble();
		double ab = Math.sqrt((double)(a * b));
		String ans = "No";
		if(a + b + ab < c){
			ans = "Yes";
		}
		System.out.println(ans);
	}
}