import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		double b = sc.nextDouble();
		double ans = (a*(b*100))/100;
	   // System.out.println(ans);
		System.out.println((long)ans);
	}
}